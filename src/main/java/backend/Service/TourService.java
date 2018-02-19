package backend.Service;

import backend.Entities.Tour;

import java.util.List;

public interface TourService {

    void createTour(Tour tour);

    void updateTour(Tour tour);

    void deleteTour(Tour tour);

    Tour findBandById(int id);

    List<Tour> findAll();

    void deleteAll(List<Tour> tours);
}
