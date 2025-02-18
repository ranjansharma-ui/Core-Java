package Keybords.Super_Keyword.Static_Keywords;
/*
   -> A class can be made static only if it is a nested class.
      we cannot declare a top-of class with static modifier but can declare nested class as static.
 */
public class Class {
    static class Node{ // nested class
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void display(Node head){
        while(head != null){
            System.out.print(head.data+ " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(8);
        Node d = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        display(a);

    }


}
