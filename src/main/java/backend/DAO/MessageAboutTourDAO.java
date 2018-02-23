package backend.DAO;

import backend.Entities.MessageAboutTour;

import java.util.List;

public interface MessageAboutTourDAO extends GenericDAO<MessageAboutTour, Integer> {

    MessageAboutTour findById(int id);

    List<MessageAboutTour> findAll();
}
