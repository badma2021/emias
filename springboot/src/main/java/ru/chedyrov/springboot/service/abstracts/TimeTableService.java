package ru.chedyrov.springboot.service.abstracts;
import ru.chedyrov.springboot.model.TimeTable;

import java.util.List;

public interface TimeTableService {
    List<TimeTable> getAllTimeTables();

    TimeTable getTimeTableById(Long id);

    void saveTimeTable(TimeTable timeTable);

    void updateTimeTable(TimeTable timeTable);

    void deleteTimeTable(Long id);
}
