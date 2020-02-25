package lesson09.warmupMine.t4;


public class Formatter2{
    private String message;
    public Formatter2(String message) {
        this.message = message;
    }
    public Formatter2(Formatter3 fmt3){
        this.message = fmt3.toString().toUpperCase();
    }
    @Override
    public String toString() {
        return message.toUpperCase();
    }
}
