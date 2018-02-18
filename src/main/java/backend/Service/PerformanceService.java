package backend.Service;

import backend.Entities.Performance;

import java.util.List;

public interface PerformanceService {

    void createPerformance(Performance performance);

    void updatePerformance(Performance performance);

    void deletePerformance(Performance performance);

    Performance findBandById(int id);

    List<Performance> findAll();

    void deleteAll(List<Performance> performances);
}
