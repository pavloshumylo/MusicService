package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.TourDAO;
import backend.Entities.Tour;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("tourDAO")
public class TourDAOImpl extends HibernateDAO<Tour, Integer> implements TourDAO {

    @Override
    public Tour findById(int id) {
        Tour tour = (Tour)currentSession().get(daoType, id);
        Hibernate.initialize(tour.getTourDetailPlaces());
        Hibernate.initialize(tour.getBand());
        Hibernate.initialize(tour.getMessagesAboutTour());
        return tour;
    }

    @Override
    public List<Tour> findAll() {
        List<Tour> tours = currentSession().createQuery("from " + daoType.getName()).getResultList();
        for(Tour tour : tours)
        {
            Hibernate.initialize(tour.getTourDetailPlaces());
            Hibernate.initialize(tour.getBand());
            Hibernate.initialize(tour.getMessagesAboutTour());
        }
        return tours;
    }
}
