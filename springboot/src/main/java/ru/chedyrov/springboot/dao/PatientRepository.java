package ru.chedyrov.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chedyrov.springboot.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
