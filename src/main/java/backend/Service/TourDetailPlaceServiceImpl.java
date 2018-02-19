package backend.Service;

import backend.DAO.TourDetailPlaceDAO;
import backend.Entities.TourDetailPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TourDetailPlaceServiceImpl implements TourDetailPlaceService {

    private TourDetailPlaceDAO tourDetailPlaceDAO;

    @Autowired
    public void setTourDetailPlaceDAO(TourDetailPlaceDAO tourDetailPlaceDAO) {
        this.tourDetailPlaceDAO = tourDetailPlaceDAO;
    }

    @Override
    public void createTourDetailPlace(TourDetailPlace tourDetailPlace) {
        tourDetailPlaceDAO.create(tourDetailPlace);
    }

    @Override
    public void updateTourDetailPlace(TourDetailPlace tourDetailPlace) {
        tourDetailPlaceDAO.update(tourDetailPlace);
    }

    @Override
    public void deleteTourDetailPlace(TourDetailPlace tourDetailPlace) {
        tourDetailPlaceDAO.delete(tourDetailPlace);
    }

    @Override
    public TourDetailPlace findBandById(int id) {
        return tourDetailPlaceDAO.findById(id);
    }

    @Override
    public List<TourDetailPlace> findAll() {
        return tourDetailPlaceDAO.findAll();
    }

    @Override
    public void deleteAll(List<TourDetailPlace> tourDetailPlaces) {
        tourDetailPlaceDAO.deleteAll(tourDetailPlaces);
    }
}
