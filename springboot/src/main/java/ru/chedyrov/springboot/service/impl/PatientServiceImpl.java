package ru.chedyrov.springboot.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chedyrov.springboot.dao.PatientRepository;
import ru.chedyrov.springboot.model.Patient;
import ru.chedyrov.springboot.service.abstracts.PatientService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return null;
    }

    @Override
    public Patient getPatientById(Long id) {

        return patientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("fgdgf" + id));
    }


    @Override
    public void savePatient(Patient patient) {

    }

    @Override
    public void updatePatient(Patient patient) {

    }

    @Override
    public void deletePatient(Long id) {

    }
}
