package Queues;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriolityQueues{
    public static void main(String[] args) {
        Queue<Double> gpa = new PriorityQueue<Double>(Collections.reverseOrder());//add proority queues to arrange them in a crtain order from one with highest priority to lowest
        //this case is highest to lowest
        gpa.offer(2.7);//add gpa's
        gpa.offer(3.7);
        gpa.offer(4.0);
        gpa.offer(1.9);
        gpa.offer(3.4);
    

    while(!gpa.isEmpty()){//loop through the whole list
        System.out.println(gpa.poll());

    }
/*Basically priority queues are meant to store elemnts in a certain order */
}
}