package backend.DAO;

import backend.Entities.BandPhoto;

import java.util.List;

public interface BandPhotoDAO extends GenericDAO<BandPhoto, Integer> {

    BandPhoto findById(int id);

    List<BandPhoto> findAll();
}
