package Hibernate.repository;

import Hibernate.config.HibernateConfig;
import Hibernate.entity.Client;

import javax.persistence.EntityManager;

public class ClientRepositoryImpl implements ClientRepository {

    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void saveClients(Client client) {

    }

    @Override
    public void deleteById(Long clientId) {

    }

    @Override
    public void findById(Long clientId) {

    }
}
