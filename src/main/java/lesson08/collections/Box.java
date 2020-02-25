package lesson08.collections;

import java.util.Objects;

public class Box<AnyType> {
    private final AnyType value;

    public Box(AnyType value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return value == box.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
