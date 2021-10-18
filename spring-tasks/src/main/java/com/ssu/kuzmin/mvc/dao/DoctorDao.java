package com.ssu.kuzmin.mvc.dao;

import com.ssu.kuzmin.mvc.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {
}
