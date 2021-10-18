package com.ssu.kuzmin.mvc.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
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
    private List<Appointment> appointments;

    public Human() {}

    public Human(int id, String firstName, String lastName, String patronymic, String email, String number, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.email = email;
        this.number = number;
        this.password = password;
        this.appointments = new ArrayList<>();
    }
}
