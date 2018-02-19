package backend.Service;

import backend.DAO.UserPhotoDAO;
import backend.Entities.UserPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserPhotoServiceImpl implements UserPhotoService {

    private UserPhotoDAO userPhotoDAO;

    @Autowired
    public void setUserPhotoDAO(UserPhotoDAO userPhotoDAO) {
        this.userPhotoDAO = userPhotoDAO;
    }

    @Override
    public void createUserPhoto(UserPhoto userPhoto) {
        userPhotoDAO.create(userPhoto);
    }

    @Override
    public void updateUserPhoto(UserPhoto userPhoto) {
        userPhotoDAO.update(userPhoto);
    }

    @Override
    public void deleteUserPhoto(UserPhoto userPhoto) {
        userPhotoDAO.delete(userPhoto);
    }

    @Override
    public UserPhoto findBandById(int id) {
        return userPhotoDAO.findById(id);
    }

    @Override
    public List<UserPhoto> findAll() {
        return userPhotoDAO.findAll();
    }

    @Override
    public void deleteAll(List<UserPhoto> userPhotos) {
        userPhotoDAO.deleteAll(userPhotos);
    }
}
