package DAO;

import java.util.List;

public interface IDAO<T> {
    boolean create (T o);
    boolean update (T o);
    boolean delete (T o);
    T findByID (int id);
    List<T> findByAll ();
}
