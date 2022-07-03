package ru.chedyrov.springboot.service.abstracts;
import ru.chedyrov.springboot.model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();

    Patient getPatientById(Long id);

    void savePatient(Patient patient);

    void updatePatient(Patient patient);

    void deletePatient(Long id);
}
