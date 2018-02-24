package backend.DAO;

import backend.Entities.Tour;

import java.util.List;

public interface TourDAO extends GenericDAO<Tour, Integer> {

    Tour findById(int id);

    List<Tour> findAll();
}
