package backend.DAO;

import backend.Entities.Band;

import java.util.List;

public interface BandDAO extends GenericDAO<Band, Integer> {

    Band findBy(int id);

    List<Band> find();
}
