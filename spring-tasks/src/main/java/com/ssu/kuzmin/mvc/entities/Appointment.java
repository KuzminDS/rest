package com.ssu.kuzmin.mvc.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "appointments")
@Builder
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Column(name = "doctor_id", nullable = false)
    private Integer doctorId;
    @Column(name = "date", nullable = false)
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
//    private Session session;

    public Appointment() {}

    public Appointment(Integer id, Integer userId, Integer doctorId, Date date) {
        this.id = id;
        this.userId = userId;
        this.doctorId = doctorId;
        this.date = date;
    }

//    public Appointment(int id, User user, Doctor doctor, Date date, Session session) {
//        this.id = id;
//        this.user = user;
//        this.doctor = doctor;
//        this.date = date;
//        this.session = session;
//    }
}
