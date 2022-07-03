package ru.chedyrov.springboot.service.abstracts;

import ru.chedyrov.springboot.model.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();

    Doctor getDoctorById(Long id);

    void saveDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    void deleteDoctor(Long id);
}
