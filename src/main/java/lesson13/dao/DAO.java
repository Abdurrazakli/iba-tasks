package lesson13.dao;

import java.util.Collection;
import java.util.List;

public interface DAO<A> {
    A get(int id);
    Collection<A> getAll();
    void create(A obj);
    void delete(int id);
}
