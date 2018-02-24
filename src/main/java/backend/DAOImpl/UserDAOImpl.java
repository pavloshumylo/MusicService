package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.UserDAO;
import backend.Entities.User;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDAO")
public class UserDAOImpl extends HibernateDAO<User, Integer> implements UserDAO {

    @Override
    public User findById(int id) {
        User user = (User) currentSession().get(daoType, id);
        Hibernate.initialize(user.getBandsSubscriptions());
        Hibernate.initialize(user.getUserPhotos());
        Hibernate.initialize(user.getMessagesAboutTour());
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = currentSession().createQuery("from " + daoType.getName()).getResultList();
        for(User user : users)
        {
            Hibernate.initialize(user.getBandsSubscriptions());
            Hibernate.initialize(user.getUserPhotos());
            Hibernate.initialize(user.getMessagesAboutTour());
        }
        return users;
    }
}
