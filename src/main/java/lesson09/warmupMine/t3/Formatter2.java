package lesson09.warmupMine.t3;


public class Formatter2{
    String message;
    public Formatter2(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message.toUpperCase();
    }
}
