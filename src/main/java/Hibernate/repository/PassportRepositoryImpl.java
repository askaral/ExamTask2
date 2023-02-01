package Hibernate.repository;

import Hibernate.config.HibernateConfig;
import Hibernate.entity.Passport;

import javax.persistence.EntityManager;

public class PassportRepositoryImpl implements PassportRepository{

    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void addingPassportToClient() {

    }

    @Override
    public void savePassports(Passport passport) {

    }

    @Override
    public void deleteAllPassports(Passport passport) {

    }
}
