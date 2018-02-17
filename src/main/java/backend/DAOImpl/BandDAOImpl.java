package backend.DAOImpl;

import backend.DAO.BandDAO;
import backend.DAO.HibernateDAO;
import backend.Entities.Band;
import org.springframework.stereotype.Repository;

@Repository("bandDAO")
public class BandDAOImpl extends HibernateDAO<Band, Integer> implements BandDAO {
}
