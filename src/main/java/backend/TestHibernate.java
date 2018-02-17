package backend;

import backend.Entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TestHibernate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Band.class)
                .addAnnotatedClass(BandPhoto.class)
                .addAnnotatedClass(MessageAboutTour.class)
                .addAnnotatedClass(Performance.class)
                .addAnnotatedClass(Tour.class)
                .addAnnotatedClass(TourDetailPlace.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(UserPhoto.class)
                .buildSessionFactory();
        sessionFactory.close();
    }
}