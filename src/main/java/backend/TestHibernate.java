package backend;

import backend.DAOImpl.BandDAOImpl;
import backend.Entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;


public class TestHibernate {
    public static void main(String[] args) {
      /*  SessionFactory sessionFactory = new Configuration()
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

        Band band = new Band();
        Date date = Date.from(Instant.now());
        band.setDateOfCreate(date);
        band.setDescription("Description");
        band.setMembers("Members");
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(band);
        session.getTransaction().commit();
        sessionFactory.close();*/
    }
}