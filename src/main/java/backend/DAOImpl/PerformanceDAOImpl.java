package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.PerformanceDAO;
import backend.Entities.Performance;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("performanceDAO")
public class PerformanceDAOImpl extends HibernateDAO<Performance, Integer> implements PerformanceDAO {

    @Override
    public Performance findById(int id) {
        Performance performance = (Performance) currentSession().get(daoType, id);
        Hibernate.initialize(performance.getBand());
        Hibernate.initialize(performance.getTourDetailPlace());
        return performance;
    }

    @Override
    public List<Performance> findAll() {
        List<Performance> performances = currentSession().createQuery("from " + daoType.getName()).getResultList();
        for(Performance performance : performances)
        {
            Hibernate.initialize(performance.getBand());
            Hibernate.initialize(performance.getTourDetailPlace());
        }
        return performances;
    }
}
