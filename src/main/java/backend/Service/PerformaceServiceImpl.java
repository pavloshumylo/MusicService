package backend.Service;

import backend.DAO.PerformanceDAO;
import backend.Entities.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PerformaceServiceImpl implements PerformanceService {

    private PerformanceDAO performanceDAO;

    @Autowired
    public void setPerformanceDAO(PerformanceDAO performanceDAO) {
        this.performanceDAO = performanceDAO;
    }

    @Override
    public void createPerformance(Performance performance) {
        performanceDAO.create(performance);
    }

    @Override
    public void updatePerformance(Performance performance) {
        performanceDAO.update(performance);
    }

    @Override
    public void deletePerformance(Performance performance) {
        performanceDAO.delete(performance);
    }

    @Override
    public Performance findBandById(int id) {
        return performanceDAO.findById(id);
    }

    @Override
    public List<Performance> findAll() {
        return performanceDAO.findAll();
    }

    @Override
    public void deleteAll(List<Performance> performances) {
        performanceDAO.deleteAll(performances);
    }
}
