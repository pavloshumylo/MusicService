package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.PerformanceDAO;
import backend.Entities.Performance;
import org.springframework.stereotype.Repository;

@Repository("performanceDAO")
public class PerformanceDAOImpl extends HibernateDAO<Performance, Integer> implements PerformanceDAO {
}
