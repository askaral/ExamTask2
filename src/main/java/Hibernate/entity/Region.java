package Hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    @Column(name = "region_name")
    private String regionName;
    @OneToMany(mappedBy = "region_id")
    private List<Bank> banks;
}
