package Hibernate.repository;

import Hibernate.entity.Bank;
import Hibernate.entity.Region;

public interface BankRepository {
    void saveBank(Bank bank);
    void deleteById(Long bankId);
    void getBanksByRegionName(String name, Bank bank);
}
