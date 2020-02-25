package lesson09.warmupMine.t4;



public class Formatter1{
    private String message;
    public Formatter1(String message) {
        this.message = message;
    }
    public Formatter1(Formatter3 fmt3){
        this.message = fmt3.toString().toLowerCase();
    }

    @Override
    public String toString() {
        return message.toLowerCase();
    }
}
