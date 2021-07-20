package ua.kiev.minaeva.semcoworking.entity;

import javax.persistence.*;

@Entity
@Table(name = "visitor")
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "is_subscribed")
    private boolean isSubscribed;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prepaid", referencedColumnName = "prepaid_id" )
    private Prepaid prepaid;

}
