package ru.chedyrov.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;

}
