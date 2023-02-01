package Hibernate.repository;

import Hibernate.entity.Passport;

public interface PassportRepository {
    void savePassports(Passport passport);
    void deleteAllPassports(Passport passport);
    void addingPassportToClient();
}
