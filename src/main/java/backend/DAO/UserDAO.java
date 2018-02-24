package backend.DAO;

import backend.Entities.User;

import java.util.List;

public interface UserDAO extends GenericDAO<User, Integer> {

    User findById(int id);

    List<User> findAll();
}
