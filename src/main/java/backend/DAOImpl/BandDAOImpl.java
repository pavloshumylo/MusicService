package backend.DAOImpl;

import backend.DAO.BandDAO;
import backend.DAO.HibernateDAO;
import backend.Entities.Band;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bandDAO")
public class BandDAOImpl extends HibernateDAO<Band, Integer> implements BandDAO {

    @Override
    public Band findBy(int id) {
        Band band = (Band)currentSession().get(daoType, id);
        Hibernate.initialize(band.getBandTours());
        Hibernate.initialize(band.getBandPerformances());
        Hibernate.initialize(band.getBandPhotos());
        Hibernate.initialize(band.getSubscribedUsers());
        return band;
    }

    @Override
    public List<Band> find() {
        List<Band> bands = currentSession().createQuery("from " + daoType.getName()).getResultList();
        for(Band band : bands)
        {
            Hibernate.initialize(band.getBandTours());
            Hibernate.initialize(band.getBandPerformances());
            Hibernate.initialize(band.getBandPhotos());
            Hibernate.initialize(band.getSubscribedUsers());
        }
        return bands;
    }
}
