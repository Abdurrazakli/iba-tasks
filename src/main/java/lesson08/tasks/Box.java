package lesson08.tasks;

import java.util.Objects;

public class Box implements Comparable<Box> {
    int value;

    public Box(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Box o) {
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return String.format("Box{value=%d}", value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return value == box.value;
    }

    @Override
    public int hashCode() {
        return value * 7;
    }
}
