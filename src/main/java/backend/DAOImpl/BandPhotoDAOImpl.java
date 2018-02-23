package backend.DAOImpl;

import backend.DAO.BandPhotoDAO;
import backend.DAO.HibernateDAO;
import backend.Entities.BandPhoto;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bandPhotoDAO")
public class BandPhotoDAOImpl extends HibernateDAO<BandPhoto, Integer> implements BandPhotoDAO {

    @Override
    public BandPhoto findById(int id) {
        BandPhoto bandPhoto = (BandPhoto) currentSession().get(daoType, id);
        Hibernate.initialize(bandPhoto.getBand());
        return bandPhoto;
    }

    @Override
    public List<BandPhoto> findAll() {
        List<BandPhoto> bandPhotos = currentSession().createQuery("from " + daoType.getName()).getResultList();
        for(BandPhoto bandPhoto : bandPhotos)
        {
            Hibernate.initialize(bandPhoto.getBand());
        }
        return bandPhotos;
    }
}
