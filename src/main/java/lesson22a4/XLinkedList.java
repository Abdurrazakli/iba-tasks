package lesson22a4;

public class XLinkedList {

  static class Node {
    final int value;
    Node next;

    Node(int value) {
      this.value = value;
      this.next = null;
    }

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

  }

  Node head = null;

  // it modifies the structure and returns new head
  void prepend(int element) {
    Node newHead = new Node(element,head);
    head = newHead;
  }

  void append(int element) {
    Node node = new Node(element);

    if(head == null){
      head.next = node;
    }else {
      Node end = head;
      while (end.next != null) {
          end = end.next;
      }

      end.next = node;
    }
  }

  int size() {
    int size = 0;
    Node start = head;
    while (start != null){
      start = start.next;
      size++;
    }
    return size;
  }

  boolean contains(int element) {
    Node start = head;
   /* if (start.value == element) return true;*/
    while (start != null) {
      if (start.value == element) return true;
      start = start.next;
    }
    return false;
  }

  Node reverse() {
    throw new IllegalArgumentException("reverse:hasn't implemented yet");
  }
}
