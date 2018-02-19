package backend.Service;

import backend.Entities.UserPhoto;

import java.util.List;

public interface UserPhotoService {

    void createUserPhoto(UserPhoto userPhoto);

    void updateUserPhoto(UserPhoto userPhoto);

    void deleteUserPhoto(UserPhoto userPhoto);

    UserPhoto findBandById(int id);

    List<UserPhoto> findAll();

    void deleteAll(List<UserPhoto> userPhotos);
}
