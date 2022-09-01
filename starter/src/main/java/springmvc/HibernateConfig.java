package springmvc;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {
    public HibernateConfig() {
    }

    @Bean
    public SessionFactory getFactory(){

        SessionFactory factory = (new org.hibernate.cfg.Configuration()).configure("hibernate.cfg.xml").addAnnotatedClass(MovieEntity.class).buildSessionFactory();
        return factory;
    }



}