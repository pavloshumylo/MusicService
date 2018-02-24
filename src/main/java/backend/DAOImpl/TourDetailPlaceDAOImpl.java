package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.TourDetailPlaceDAO;
import backend.Entities.TourDetailPlace;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("tourDetailPlace")
public class TourDetailPlaceDAOImpl extends HibernateDAO<TourDetailPlace, Integer> implements TourDetailPlaceDAO {

    @Override
    public TourDetailPlace findById(int id) {
        TourDetailPlace tourDetailPlace = (TourDetailPlace) currentSession().get(daoType, id);
        Hibernate.initialize(tourDetailPlace.getPerformances());
        Hibernate.initialize(tourDetailPlace.getTour());
        return tourDetailPlace;
    }

    @Override
    public List<TourDetailPlace> findAll() {
        List<TourDetailPlace> tourDetailPlaces = currentSession().createQuery("from " + daoType.getName()).getResultList();
        for (TourDetailPlace tourDetailPlace : tourDetailPlaces) {
            Hibernate.initialize(tourDetailPlace.getPerformances());
            Hibernate.initialize(tourDetailPlace.getTour());
        }
        return tourDetailPlaces;
    }
}
