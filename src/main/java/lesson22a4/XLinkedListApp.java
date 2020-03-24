package lesson22a4;

public class XLinkedListApp {
    public static void main(String[] args) {
        XLinkedList xLinkedList = new XLinkedList();
        xLinkedList.head = new XLinkedList.Node(5);
        xLinkedList.append(6);
        xLinkedList.prepend(4);
        System.out.println(xLinkedList.contains(6));
        System.out.println(xLinkedList.contains(7));
    }
}
