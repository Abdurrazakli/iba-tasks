package lesson03.DuringLesson;

public class EnumApp {
    public static void main(String[] args) {
        OrderStatuses statuses = OrderStatuses.Placed;

        if(statuses == OrderStatuses.Placed){
            System.out.println(OrderStatuses.InDelivery.toString());
        }

    }
}
