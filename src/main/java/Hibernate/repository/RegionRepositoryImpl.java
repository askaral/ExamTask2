package Hibernate.repository;

import Hibernate.config.HibernateConfig;
import Hibernate.entity.Region;

import javax.persistence.EntityManager;
import java.util.List;

public class RegionRepositoryImpl implements RegionRepository{

    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void saveRegion(Region region) {

    }

    @Override
    public List<Region> getAllRegion() {
        return null;
    }

    @Override
    public void updateRegion(Long regionId, Region newRegion) {

    }
}
