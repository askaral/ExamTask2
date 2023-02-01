package Hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "passports")
public class Passport {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "pass_inn")
    private String inn;
    @OneToOne()
    private Client client;
}
