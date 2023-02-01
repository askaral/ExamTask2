package Hibernate.config;

import Hibernate.entity.Bank;
import Hibernate.entity.Client;
import Hibernate.entity.Passport;
import Hibernate.entity.Region;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;

import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateConfig {

    public static EntityManager getEntityManager(){

        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/ExamTask2");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "postgres");
        configuration.setProperty(HBM2DDL_AUTO, "create");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        configuration.setProperty(SHOW_SQL, "true");
        configuration.addAnnotatedClass(Client.class);
        configuration.addAnnotatedClass(Passport.class);
        configuration.addAnnotatedClass(Bank.class);
        configuration.addAnnotatedClass(Region.class);
        return configuration.buildSessionFactory().createEntityManager();




    }
}
