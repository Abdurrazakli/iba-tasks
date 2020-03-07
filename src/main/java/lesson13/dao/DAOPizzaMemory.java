package lesson13.dao;

import java.util.*;

public class DAOPizzaMemory implements DAO<Pizza>{
    private Map<Integer,Pizza> storage = new HashMap<>();
    @Override
    public Pizza get(int id) {
        return storage.get(id);
    }

    @Override
    public Collection<Pizza> getAll() {
        return storage.values();
    }

    @Override
    public void create(Pizza pizza) {
        storage.put(pizza.id,pizza);
    }

    @Override
    public void delete(int id) {
        storage.remove(storage.get(id));
    }
}
