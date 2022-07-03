package ru.chedyrov.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.chedyrov.springboot.model.TimeTable;
import ru.chedyrov.springboot.service.abstracts.TimeTableService;

import java.util.List;

@RestController

@RequestMapping("/api")
public class TimeTableController {
    private final TimeTableService timeTableService;

    @Autowired
    public TimeTableController(TimeTableService timeTableService) {
        this.timeTableService = timeTableService;
    }

    @GetMapping("/timetables")
    public ResponseEntity<List<TimeTable>> getTimeTables(){
        List<TimeTable> timeTables=timeTableService.getAllTimeTables();
        return new ResponseEntity<>(timeTables, HttpStatus.OK);
    }
    @GetMapping("/timetables/{id}")
    public ResponseEntity<TimeTable> getTimeTableById(@PathVariable Long id){
        TimeTable timeTable=timeTableService.getTimeTableById(id);
        return new ResponseEntity<>(timeTable, HttpStatus.OK);
    }
    @PostMapping("/timetable")
    public ResponseEntity<TimeTable> createNewTimeTable(@RequestBody TimeTable timeTable){
timeTableService.saveTimeTable(timeTable);
return new ResponseEntity<>(HttpStatus.OK);
    }
}
