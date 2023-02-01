package Hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "banks")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @ManyToMany(mappedBy = "client_id")
    private List<Client> client;
    @ManyToOne
    private Region region;
}
