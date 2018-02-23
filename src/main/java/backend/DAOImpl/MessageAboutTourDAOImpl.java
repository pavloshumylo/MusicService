package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.MessageAboutTourDAO;
import backend.Entities.MessageAboutTour;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("messageAboutTourDAO")
public class MessageAboutTourDAOImpl extends HibernateDAO<MessageAboutTour, Integer> implements MessageAboutTourDAO {

    @Override
    public MessageAboutTour findById(int id) {
        MessageAboutTour messageAboutTour = (MessageAboutTour) currentSession().get(daoType, id);
        Hibernate.initialize(messageAboutTour.getUser());
        Hibernate.initialize(messageAboutTour.getTour());
        return messageAboutTour;
    }

    @Override
    public List<MessageAboutTour> findAll() {
        List<MessageAboutTour> messageAboutTours = currentSession().createQuery("from " + daoType.getName()).getResultList();
        for(MessageAboutTour messageAboutTour : messageAboutTours)
        {
            Hibernate.initialize(messageAboutTour.getUser());
            Hibernate.initialize(messageAboutTour.getTour());
        }
        return messageAboutTours;
    }
}
