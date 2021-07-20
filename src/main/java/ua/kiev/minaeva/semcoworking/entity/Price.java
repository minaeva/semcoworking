package ua.kiev.minaeva.semcoworking.entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hour_first")
    private double hourFirst;

    @Column(name = "hour_second")
    private double hourSecond;

    @Column(name = "hour_other")
    private double hourOther;

    @Column(name = "day")
    private double day;

    @Column(name = "week")
    private double week;

    @Column(name = "month")
    private double month;

}
