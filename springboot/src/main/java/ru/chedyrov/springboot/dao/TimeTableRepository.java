package ru.chedyrov.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chedyrov.springboot.model.Doctor;
import ru.chedyrov.springboot.model.TimeTable;
import ru.chedyrov.springboot.model.enums.Reserved;

import java.util.List;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable,Long> {

    List<TimeTable> getByReserved(Reserved reserved);
}
