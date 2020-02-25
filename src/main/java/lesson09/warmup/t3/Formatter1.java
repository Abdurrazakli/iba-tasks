package lesson09.warmup.t3;



public class Formatter1{
    String message;
    public Formatter1(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message.toLowerCase();
    }
}
