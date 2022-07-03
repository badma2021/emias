package ru.chedyrov.springboot.initDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.chedyrov.springboot.dao.DoctorRepository;
import ru.chedyrov.springboot.dao.PatientRepository;
import ru.chedyrov.springboot.dao.TimeTableRepository;
import ru.chedyrov.springboot.model.Doctor;
import ru.chedyrov.springboot.model.Patient;
import ru.chedyrov.springboot.model.TimeTable;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData {
    private final DoctorRepository doctorRepository;
    private final TimeTableRepository timeTableRepository;
    private final PatientRepository patientRepository;

    @Autowired
    public InitData(DoctorRepository doctorRepository, TimeTableRepository timeTableRepository, PatientRepository patientRepository) {
        this.doctorRepository = doctorRepository;
        this.timeTableRepository = timeTableRepository;
        this.patientRepository = patientRepository;
    }

    @PostConstruct
    public void initializationDB() throws IOException {
        Doctor doctor1 = Doctor.builder()
                .firstName("Filipp")
                .lastName("Preoprazhensky")
                .build();

        Doctor doctor2 = Doctor.builder()
                .firstName("Nikolay")
                .lastName("Pirogov")
                .build();

        Doctor doctor3 = Doctor.builder()
                .firstName("Doctor")
                .lastName("Aibolit")
                .build();
        doctorRepository.save(doctor1);
        doctorRepository.save(doctor2);
        doctorRepository.save(doctor3);

        Patient patient1= Patient.builder()
                .firstName("Poligraph")
                .lastName("Sharikov")
             //   .timeTable(null)
                .build();
        Patient patient2= Patient.builder()
                .firstName("Ivan")
                .lastName("Ivanov")
              //  .timeTable(null)
                .build();
        Patient patient3= Patient.builder()
                .firstName("Maria")
                .lastName("Kochergina")
               // .timeTables(null)
                .build();
        patientRepository.save(patient1);
        patientRepository.save(patient2);
        patientRepository.save(patient3);

        TimeTable timeTable1=TimeTable.builder()
                .date(LocalDate.now())
                .timeInterval(LocalTime.of(9,0))
                .reserved(1)
                .doctors(null)
                .patient(patient2)
                .build();
        TimeTable timeTable2=TimeTable.builder()
                .date(LocalDate.now())
                .timeInterval(LocalTime.of(9,15))
                .reserved(1)
                .doctors(null)
                .patient(patient3)
                .build();
        TimeTable timeTable3=TimeTable.builder()
                .date(LocalDate.now())
                .timeInterval(LocalTime.of(9,30))
                .reserved(1)
                .doctors(null)
                .patient(patient1)
                .build();
        TimeTable timeTable4=TimeTable.builder()
                .date(LocalDate.now())
                .timeInterval(LocalTime.of(9,45))
                .reserved(0)
                .doctors(null)
                .patient(null)
                .build();
        timeTableRepository.save(timeTable1);
        timeTableRepository.save(timeTable2);
        timeTableRepository.save(timeTable3);
        timeTableRepository.save(timeTable4);


    }
}
