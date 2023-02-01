package Hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clients")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "phone_nuber")
    private String phoneNumber;
    @OneToOne(mappedBy = "passport_id")
    private Passport passport;
    @ManyToMany
    private List<Bank> bank;


}
