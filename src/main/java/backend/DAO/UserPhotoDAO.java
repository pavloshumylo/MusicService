package backend.DAO;

import backend.Entities.UserPhoto;

import java.util.List;

public interface UserPhotoDAO extends GenericDAO<UserPhoto, Integer> {

    UserPhoto findById(int id);

    List<UserPhoto> findAll();
}
