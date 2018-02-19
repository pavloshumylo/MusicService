package backend.Service;

import backend.Entities.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User findBandById(int id);

    List<User> findAll();

    void deleteAll(List<User> users);
}
