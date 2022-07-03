package ru.chedyrov.springboot.service.impl;

import org.springframework.stereotype.Service;
import ru.chedyrov.springboot.model.Doctor;
import ru.chedyrov.springboot.service.abstracts.DoctorService;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Override
    public List<Doctor> getAllDoctors() {
        return null;
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return null;
    }

    @Override
    public void saveDoctor(Doctor doctor) {

    }

    @Override
    public void updateDoctor(Doctor doctor) {

    }

    @Override
    public void deleteDoctor(Long id) {

    }
}
