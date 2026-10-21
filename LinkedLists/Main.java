package LinkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
    
    //linked lists are linear data structures that store elements in nodes, where each node contains a value and a reference to the next node in the sequence. They are dynamic in size and can easily grow or shrink as needed.
    //doubly linked lists are a type of linked list where each node contains references to both the next and previous nodes, allowing for bidirectional traversal. This makes it easier to insert or delete nodes from both ends of the list.
    LinkedList<String> linker = new LinkedList<String>();

   /* linker.push("Calb");
    linker.push("Macharia");
    linker.push("Wachira");
    linker.push("Gachoki"); //linke list can be treated as a stack or a queue

    linker.pop();*/
    linker.offer("Calb");
    linker.offer("Macharia");//linked list as a queue
    linker.offer("Wachira");
    linker.offer("Gachoki");

    //linker.poll();
   linker.add(1, "Robin"); //inserting an element in a linked list ie the position 1 and the element you want to add
   linker.remove("Robin"); //removing an element

    //System.out.println(linker.indexOf("Wachira"));//search an index
     System.out.println(linker.peekFirst());
     System.out.println(linker.peekLast());
     linker.addFirst("Engineer");
     linker.addLast("CGH");

     linker.removeFirst();
     linker.removeLast();


    System.out.println(linker);
} 
}

//advantages of linked lists
//1. Dynamic data structure - allocated needed memory while running
//2. Insertion and deletion is easy O(1)
//3. No/Low memory waste

//disadvantages
//1. Greator memory usage due to extra pointers and addresses
//2. No random access of elements you must traverse through the whole list
//3. Accessing/Searching for elements is more time consuming O(n)

//uses
//1. Implemnt stack or queues
//2. GPS navigation
//3. Music playlist
