package backend.DAO;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<Item, Id extends Serializable>  {

    void create(Item entity);

    void update(Item entity);

    void delete(Item entity);

/* Item findById(Id id);

    List<Item> findAll();  */

    void deleteAll(List<Item> entities);

}
