package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.UserPhotoDAO;
import backend.Entities.UserPhoto;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userPhotoDAO")
public class UserPhotoDAOImpl extends HibernateDAO<UserPhoto, Integer> implements UserPhotoDAO {

    @Override
    public UserPhoto findById(int id) {
        UserPhoto userPhoto = (UserPhoto)currentSession().get(daoType, id);
        Hibernate.initialize(userPhoto.getUser());
        return userPhoto;
    }

    @Override
    public List<UserPhoto> findAll() {
        List<UserPhoto> userPhotos = currentSession().createQuery("from " + daoType.getName()).getResultList();
        for(UserPhoto userPhoto : userPhotos)
        {
            Hibernate.initialize(userPhoto.getUser());
        }
        return userPhotos;
    }
}
