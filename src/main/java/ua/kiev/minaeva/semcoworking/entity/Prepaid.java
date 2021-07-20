package ua.kiev.minaeva.semcoworking.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prepaid")
public class Prepaid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "duration_days")
    private int durationDays;

    @Column(name = "start_date")
    private LocalDate startDate;
}
