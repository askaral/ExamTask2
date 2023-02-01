package Hibernate.repository;

import Hibernate.entity.Region;

import java.util.List;

public interface RegionRepository {
    void saveRegion(Region region);
    List<Region> getAllRegion();
    void updateRegion(Long regionId, Region newRegion);
}
