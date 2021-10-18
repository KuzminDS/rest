package com.ssu.kuzmin.mvc.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.print.Doc;

@Entity
@Table(name = "doctors")
@Data
public class Doctor {

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

    public enum Position {
        Therapist,
        Dentist
    }

    private Position position;

    public Doctor() {}

//    public Doctor(int id, String firstName, String lastName, String patronymic, String email, String number, String password, Position position) {
//        super(id, firstName, lastName, patronymic, email, number, password);
//        this.position = position;
//    }
}
