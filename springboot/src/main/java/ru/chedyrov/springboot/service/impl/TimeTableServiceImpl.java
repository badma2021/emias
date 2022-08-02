package ru.chedyrov.springboot.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chedyrov.springboot.dao.TimeTableRepository;
import ru.chedyrov.springboot.model.TimeTable;
import ru.chedyrov.springboot.model.enums.Reserved;
import ru.chedyrov.springboot.service.abstracts.TimeTableService;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class TimeTableServiceImpl implements TimeTableService {
    private final TimeTableRepository timeTableRepository;

    @Override
    public List<TimeTable> getAllTimeTables() {
        List<TimeTable> timeTables = timeTableRepository.findAll();

        return timeTables;
    }
    @Override
    public List<TimeTable> getByReserved(Reserved reserved) {
        List<TimeTable> timeTables = timeTableRepository.getByReserved(reserved);

        return timeTables;
    }

    @Override
    public TimeTable getTimeTableById(Long id) {

        return timeTableRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid TimeTable Id:" + id));
    }

    @Override
    public void saveTimeTable(TimeTable timeTable) {
        timeTableRepository.saveAndFlush(timeTable);
    }

    @Override
    public void updateTimeTable(TimeTable timeTable) {

    }

    @Override
    public void deleteTimeTable(Long id) {

    }
}
