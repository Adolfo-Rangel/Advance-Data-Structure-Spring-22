package Circularlinklist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkCirc ll = new SinglyLinkCirc();
        ll.insert(32);
        ll.insert(24);
        ll.insert(67);
        ll.delete(24);
        ll.search(32);

//        System.out.println(ll.search(24));
//        System.out.println(ll.search(100));
        ll.display();
    }
}
