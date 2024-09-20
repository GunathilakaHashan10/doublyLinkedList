
public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();

        System.out.println("list size: " + linkedList.size());

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        System.out.println("list size: " + linkedList.size());
        System.out.println(linkedList);

        linkedList.removeLast();

        System.out.println("list size: " + linkedList.size());
        System.out.println(linkedList);

    }
}