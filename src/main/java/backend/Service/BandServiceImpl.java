package backend.Service;

import backend.DAO.BandDAO;
import backend.Entities.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BandServiceImpl implements BandService {

    private BandDAO bandDAO;

    @Autowired
    public void setBandDAO(BandDAO bandDAO) {
        this.bandDAO = bandDAO;
    }

    @Override
    public void createBand(Band band) {
        bandDAO.create(band);
    }

    @Override
    public void updateBand(Band band) {
        bandDAO.update(band);
    }

    @Override
    public void deleteBand(Band band) {
        bandDAO.delete(band);
    }

    @Override
    public Band findBandById(int id) {
        return bandDAO.findById(id);
    }

    @Override
    public List<Band> findAll() {
        return bandDAO.findAll();
    }

    @Override
    public void deleteAll(List<Band> bands) {
        bandDAO.deleteAll(bands);
    }
}
