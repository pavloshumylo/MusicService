package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.TourDetailPlaceDAO;
import backend.Entities.TourDetailPlace;
import org.springframework.stereotype.Repository;

@Repository("tourDetailPlace")
public class TourDetailPlaceDAOImpl extends HibernateDAO<TourDetailPlace, Integer> implements TourDetailPlaceDAO {
}
