package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.UserDAO;
import backend.Entities.User;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl extends HibernateDAO<User, Integer> implements UserDAO {
}
