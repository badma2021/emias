package ru.chedyrov.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "timetable")
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalDate date;
    @Column
    private LocalTime timeInterval;
    @Column
    private int reserved;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinColumn
    private List<Doctor> doctors;

    @OneToOne
    private Patient patient;


}
