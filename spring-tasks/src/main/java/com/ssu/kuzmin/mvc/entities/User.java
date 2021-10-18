package com.ssu.kuzmin.mvc.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName", nullable = false)
    private String lastName;
    @Column(name = "patronymic", nullable = false)
    private String patronymic;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "number", nullable = false)
    private String number;
    @Column(name = "password", nullable = false)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
//    @OneToMany
//    @JoinColumn(name = "user_id")
//    private List<Appointment> appointments;

//    private MedicalCard medicalCard;

    public User() {}

//    public User(int id, String firstName, String lastName, String patronymic, String email, String number, String password) {
//        super(id, firstName, lastName, patronymic, email, number, password);
//    }

    public User(int id, String firstName, String lastName, String patronymic, String email, String number, String password, MedicalCard medicalCard) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.email = email;
        this.number = number;
        this.password = password;
//        this.appointments = new ArrayList<>();
//        super(id, firstName, lastName, patronymic, email, number, password);
//        this.medicalCard = medicalCard;
    }
}
