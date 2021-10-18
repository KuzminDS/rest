package com.ssu.kuzmin.mvc.services;

import com.ssu.kuzmin.mvc.dao.AppointmentDao;
import com.ssu.kuzmin.mvc.entities.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public Appointment add(Appointment appointment) {
        return appointmentDao.save(appointment);
    }

    @Override
    public Appointment update(Appointment appointment) throws Exception {
        return appointmentDao.save(appointment);
    }

    @Override
    public void delete(int id) throws Exception {
        Appointment appointment = appointmentDao.getById(id);
        appointmentDao.delete(appointment);
    }

    @Override
    public Appointment getById(int id) throws Exception {
        return appointmentDao.getById(id);
    }

    @Override
    public List<Appointment> getAll() {
        return appointmentDao.findAll();
    }
}
