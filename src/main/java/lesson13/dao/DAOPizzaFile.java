package lesson13.dao;

import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DAOPizzaFile implements DAO<Pizza>{
    final String filename;

    public DAOPizzaFile(String filename) {
        this.filename = filename;
    }

    @Override
    public Pizza get(int id) {
        return null;
    }

    @Override
    public Collection<Pizza> getAll() {
        return null;
    }

    @Override
    public void create(Pizza obj) {

    }

    @Override
    public void delete(int id) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        getAll().stream().
                filter(p -> p.id != id);


    }
}
