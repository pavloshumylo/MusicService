package backend.Service;

import backend.Entities.Band;

import java.util.List;

public interface BandService {

    void createBand(Band band);

    void updateBand(Band band);

    void deleteBand(Band band);

    Band findBandById(int id);

    List<Band> findAll();

    void deleteAll(List<Band> bands);
}
