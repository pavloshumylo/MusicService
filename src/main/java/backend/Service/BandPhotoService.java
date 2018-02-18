package backend.Service;

import backend.Entities.BandPhoto;

import java.util.List;

public interface BandPhotoService {

    void createBandPhoto(BandPhoto bandPhoto);

    void updateBandPhoto(BandPhoto bandPhoto);

    void deleteBandPhoto(BandPhoto bandPhoto);

    BandPhoto findBandById(int id);

    List<BandPhoto> findAll();

    void deleteAll(List<BandPhoto> bandPhotos);
}
