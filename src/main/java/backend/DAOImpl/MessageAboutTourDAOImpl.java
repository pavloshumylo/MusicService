package backend.DAOImpl;

import backend.DAO.HibernateDAO;
import backend.DAO.MessageAboutTourDAO;
import backend.Entities.MessageAboutTour;
import org.springframework.stereotype.Repository;

@Repository("messageAboutTourDAO")
public class MessageAboutTourDAOImpl extends HibernateDAO<MessageAboutTour, Integer> implements MessageAboutTourDAO {
}
