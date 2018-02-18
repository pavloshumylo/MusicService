package backend.Service;

import backend.DAO.BandPhotoDAO;
import backend.Entities.BandPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BandPhotoServiceImpl implements BandPhotoService {

    private BandPhotoDAO bandPhotoDAO;

    @Autowired
    public void setBandPhotoDAO(BandPhotoDAO bandPhotoDAO) {
        this.bandPhotoDAO = bandPhotoDAO;
    }

    @Override
    public void createBandPhoto(BandPhoto bandPhoto) {
        bandPhotoDAO.create(bandPhoto);
    }

    @Override
    public void updateBandPhoto(BandPhoto bandPhoto) {
        bandPhotoDAO.update(bandPhoto);
    }

    @Override
    public void deleteBandPhoto(BandPhoto bandPhoto) {
        bandPhotoDAO.delete(bandPhoto);
    }

    @Override
    public BandPhoto findBandById(int id) {
        return bandPhotoDAO.findById(id);
    }

    @Override
    public List<BandPhoto> findAll() {
        return bandPhotoDAO.findAll();
    }

    @Override
    public void deleteAll(List<BandPhoto> bands) {
        bandPhotoDAO.deleteAll(bands);
    }
}
