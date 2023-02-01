package Hibernate.repository;

import Hibernate.config.HibernateConfig;
import Hibernate.entity.Bank;

import javax.persistence.EntityManager;

public class BankRepositoryImpl implements BankRepository{

    private  final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void saveBank(Bank bank) {

    }

    @Override
    public void deleteById(Long bankId) {

    }

    @Override
    public void getBanksByRegionName(String name, Bank bank) {

    }
}
