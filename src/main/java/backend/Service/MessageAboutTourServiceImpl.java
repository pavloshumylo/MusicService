package backend.Service;

import backend.DAO.MessageAboutTourDAO;
import backend.Entities.MessageAboutTour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MessageAboutTourServiceImpl implements MessageAboutTourService{

    private MessageAboutTourDAO messageAboutTourDAO;

    @Autowired
    public void setMessageAboutTourDAO(MessageAboutTourDAO messageAboutTourDAO) {
        this.messageAboutTourDAO = messageAboutTourDAO;
    }

    @Override
    public void createMessageAboutTour(MessageAboutTour messageAboutTour) {
        messageAboutTourDAO.create(messageAboutTour);
    }

    @Override
    public void updateMessageAboutTour(MessageAboutTour messageAboutTour) {
        messageAboutTourDAO.update(messageAboutTour);
    }

    @Override
    public void deleteMessageAboutTour(MessageAboutTour messageAboutTour) {
        messageAboutTourDAO.delete(messageAboutTour);
    }

    @Override
    public MessageAboutTour findBandById(int id) {
        return messageAboutTourDAO.findById(id);
    }

    @Override
    public List<MessageAboutTour> findAll() {
        return messageAboutTourDAO.findAll();
    }

    @Override
    public void deleteAll(List<MessageAboutTour> messageAboutTour) {
        messageAboutTourDAO.deleteAll(messageAboutTour);
    }
}
