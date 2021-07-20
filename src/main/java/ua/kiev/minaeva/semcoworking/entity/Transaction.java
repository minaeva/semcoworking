package ua.kiev.minaeva.semcoworking.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "cost")
    private double cost;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visitor", referencedColumnName = "visitor_id" )
    private Visitor visitor;

}
