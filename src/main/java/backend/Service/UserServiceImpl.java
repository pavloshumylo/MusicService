package backend.Service;

import backend.DAO.UserDAO;
import backend.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void createUser(User user) {
        userDAO.create(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.create(user);
    }

    @Override
    public void deleteUser(User user) {
        userDAO.create(user);
    }

    @Override
    public User findBandById(int id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void deleteAll(List<User> users) {
        userDAO.deleteAll(users);
    }
}
