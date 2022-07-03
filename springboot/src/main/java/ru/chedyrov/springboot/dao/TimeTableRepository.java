package ru.chedyrov.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chedyrov.springboot.model.TimeTable;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable,Long> {
}
