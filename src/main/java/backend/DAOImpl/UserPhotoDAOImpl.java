package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.UserPhotoDAO;
import backend.Entities.UserPhoto;
import org.springframework.stereotype.Repository;

@Repository("userPhotoDAO")
public class UserPhotoDAOImpl extends HibernateDAO<UserPhoto, Integer> implements UserPhotoDAO {
}
