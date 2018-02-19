package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.TourDAO;
import backend.Entities.Tour;
import org.springframework.stereotype.Repository;

@Repository("tourDAO")
public class TourDAOImpl extends HibernateDAO<Tour, Integer> implements TourDAO {
}
