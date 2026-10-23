package LnkvArr;
import java.util.LinkedList;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
    

    LinkedList<Integer> linker = new LinkedList<Integer>();
    ArrayList<Integer> arry = new ArrayList<Integer>();

    long startTime;
    long endTime;
    long elapsedTime;

    for(int i = 0; i<1000000; i++){
        linker.add(i);
        arry.add(i);
    }

    //=======ArrayList=======
    startTime = System.nanoTime();
   // arry.get(0);
      //arry.get(500000);
     // arry.get(999999);
     //arry.remove(0);//takes longer time becausewehave to shift all the 1miion elements back to back 
     //arry.remove(500000);
     arry.remove(999999);
    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("ArrayList: "+elapsedTime+" ns");
    //=======LinkedList========

    startTime = System.nanoTime();
    //linker.get(0);
    //linker.get(500000);
    //linker.get(999999);
    //linker.remove(0);//takes lesser time since the focuses on insertion/deletion and array list is search
    //linker.remove(500000);
    linker.remove(999999);
    endTime = System.nanoTime();

    elapsedTime = endTime - startTime;

    System.out.println("LinkedList: "+elapsedTime+" ns");
}
}
