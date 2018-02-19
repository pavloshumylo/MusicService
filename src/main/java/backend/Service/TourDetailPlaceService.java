package backend.Service;

import backend.Entities.TourDetailPlace;

import java.util.List;

public interface TourDetailPlaceService {

    void createTourDetailPlace(TourDetailPlace tourDetailPlace);

    void updateTourDetailPlace(TourDetailPlace tourDetailPlace);

    void deleteTourDetailPlace(TourDetailPlace tourDetailPlace);

    TourDetailPlace findBandById(int id);

    List<TourDetailPlace> findAll();

    void deleteAll(List<TourDetailPlace> tourDetailPlaces);
}
