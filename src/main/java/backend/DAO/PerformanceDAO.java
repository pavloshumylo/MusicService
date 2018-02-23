package backend.DAO;

import backend.Entities.Performance;

import java.util.List;

public interface PerformanceDAO extends GenericDAO<Performance, Integer>{

    Performance findById(int id);

    List<Performance> findAll();
}
