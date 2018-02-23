package backend.DAO;

import backend.Entities.Band;

import java.util.List;

public interface BandDAO extends GenericDAO<Band, Integer> {

    Band findById(int id);

    List<Band> findAll();
}
