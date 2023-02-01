package Hibernate.repository;

import Hibernate.entity.Client;

public interface ClientRepository {
    void saveClients(Client client);
    void deleteById(Long clientId);
    void findById(Long clientId);
}
