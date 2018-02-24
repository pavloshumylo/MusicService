package backend.DAO;

import backend.Entities.TourDetailPlace;

import java.util.List;

public interface TourDetailPlaceDAO extends GenericDAO<TourDetailPlace, Integer> {

    TourDetailPlace findById(int id);

    List<TourDetailPlace> findAll();
}
