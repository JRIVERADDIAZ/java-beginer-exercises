import DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.prepend(5);
        list.prepend(10);
        list.prepend(15);
        System.out.println(list.toString()); // Output: 15 10 5
        list.append(20);
        list.append(25);
        list.append(30);
        System.out.println(list.toString()); // Output: 15 10 5 20 25 30
        list.removeFirst();
        System.out.println(list.toString()); // Output: 10 5 20 25 30
        list.removeFirst();
        System.out.println(list.toString()); // Output: 10 5 20 25
        list.removeLast();
        System.out.println(list.toString()); // Output: 10 5 20
        list.insertAt(1, 15);
        System.out.println(list.toString()); // Output: 10 5 15 20
        list.removeAt(1);
        System.out.println(list.toString()); // Output: 10 5 20
    }
}