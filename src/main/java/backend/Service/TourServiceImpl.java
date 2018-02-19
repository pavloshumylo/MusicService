package backend.Service;

import backend.DAO.TourDAO;
import backend.Entities.Tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TourServiceImpl implements TourService{

    private TourDAO tourDAO;

    @Autowired
    public void setTourDAO(TourDAO tourDAO) {
        this.tourDAO = tourDAO;
    }

    @Override
    public void createTour(Tour tour) {
        tourDAO.create(tour);
    }

    @Override
    public void updateTour(Tour tour) {
        tourDAO.update(tour);
    }

    @Override
    public void deleteTour(Tour tour) {
        tourDAO.delete(tour);
    }

    @Override
    public Tour findBandById(int id) {
        return tourDAO.findById(id);
    }

    @Override
    public List<Tour> findAll() {
        return tourDAO.findAll();
    }

    @Override
    public void deleteAll(List<Tour> tours) {
        tourDAO.deleteAll(tours);
    }
}
