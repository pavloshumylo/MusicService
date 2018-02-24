package backend.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class HibernateDAO<Item, Id extends Serializable> implements GenericDAO<Item, Id> {

    @Autowired
    public SessionFactory sessionFactory;

    protected Class<? extends Item> daoType;

    public HibernateDAO() {
        daoType = (Class<Item>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void create(Item entity) {
        currentSession().save(entity);
    }

    @Override
    public void update(Item entity) {
        currentSession().update(entity);
    }

    @Override
    public void delete(Item entity) {
        currentSession().delete(entity);
    }

    @Override
    public void deleteAll(List<Item> entities) {
        Session session = currentSession();
        for (Item entity : entities) {
            session.delete(entity);
        }
    }
}
