package com.ssu.kuzmin.mvc.services;

import com.ssu.kuzmin.mvc.dao.DoctorDao;
import com.ssu.kuzmin.mvc.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;

    @Override
    public Doctor add(Doctor doctor) {
        return doctorDao.save(doctor);
    }

    @Override
    public Doctor update(Doctor doctor) throws Exception {
        return doctorDao.save(doctor);
    }

    @Override
    public void delete(int id) throws Exception {
        Doctor doctor = getById(id);
        doctorDao.delete(doctor);
    }

    @Override
    public Doctor getById(int id) throws Exception {
        return doctorDao.getById(id);
    }

    @Override
    public List<Doctor> getAll() {
        return doctorDao.findAll();
    }
}
