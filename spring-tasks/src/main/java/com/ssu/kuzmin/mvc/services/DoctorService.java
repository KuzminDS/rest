package com.ssu.kuzmin.mvc.services;

import com.ssu.kuzmin.mvc.entities.Doctor;
import java.util.List;

public interface DoctorService {
    Doctor add(Doctor doctor);
    Doctor update(Doctor doctor) throws Exception;
    void delete(int id) throws Exception;
    Doctor getById(int id) throws Exception;
    List<Doctor> getAll();
}
