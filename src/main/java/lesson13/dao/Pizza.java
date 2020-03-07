package lesson13.dao;

public class Pizza {
    final int id;
    final int size;
    final String name;
    final double price;
    public Pizza(int id, int size, String name, double price) {
        this.id = id;
        this.size = size;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Pizza{id=%d, size=%d, name='%s', price=%s}", id, size, name, price);
    }

}
