package Queues;
//a Queue is a linear data structure that follows the first in first out FIFO Method. 
//its ability to serve the fiirst element to be added in a queue, like serving people in cashout supermarkets,
import java.util.LinkedList;
import java.util.Queue;
//Ques are extensions of linked lists in Lists

public class Main {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<String>();

        
        names.offer("Karen"); //use the .offer to enqueue, add element
        names.offer("Bob");
        names.offer("Lissa");
        names.offer("Caleb");
        names.offer("Rosa");
        
        //System.out.println(names.isEmpty()); check if queue is empty
        //System.out.println(names.contains("Lissa"));
        System.out.println(names.size());

        //System.out.println(names.peek());//To hava a look whose at the top of the line
       // names.poll();//removes the topmost element in the queue ie karen
       // names.poll();//the second most ie Bob
        System.out.println(names);
//used in keyboard buffers to store all chracters pressed line by line
//used in queus in printers to queue jobs or tasks
//used in linkedlists, priority queus and Breadth first search algorithm

    }
    
}
