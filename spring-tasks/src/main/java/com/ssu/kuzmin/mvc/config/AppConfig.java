package com.ssu.kuzmin.mvc.config;

import com.ssu.kuzmin.mvc.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
//    @Bean
//    public UserDao userDao() {
//        return new UserDaoFake();
//    }
//    @Bean
//    public DoctorDao doctorDao() {
//        return new DoctorDaoFake();
//    }
//    @Bean
//    public AppointmentDao appointmentDao() {
//        return new AppointmentDaoFake();
//    }
    @Bean
    public DoctorService doctorService() {
        return new DoctorServiceImpl();
    }
    @Bean
    public AppointmentService appointmentService() {
        return new AppointmentServiceImpl();
    }
    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}
