package backend.DAOImpl;

import backend.DAO.BandPhotoDAO;
import backend.DAO.HibernateDAO;
import backend.Entities.BandPhoto;
import org.springframework.stereotype.Repository;

@Repository("bandPhotoDAO")
public class BandPhotoDAOImpl extends HibernateDAO<BandPhoto, Integer> implements BandPhotoDAO {
}
