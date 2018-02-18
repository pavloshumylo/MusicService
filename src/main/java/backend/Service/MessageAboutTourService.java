package backend.Service;

import backend.Entities.MessageAboutTour;

import java.util.List;

public interface MessageAboutTourService {

    void createMessageAboutTour(MessageAboutTour messageAboutTour);

    void updateMessageAboutTour(MessageAboutTour messageAboutTour);

    void deleteMessageAboutTour(MessageAboutTour messageAboutTour);

    MessageAboutTour findBandById(int id);

    List<MessageAboutTour> findAll();

    void deleteAll(List<MessageAboutTour> messageAboutTour);
}
