package DynamicArrays; 
//dynamic arrays are arrays that can grow nd shrink in size as needed.
//import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        DynamArr dynamArr = new DynamArr(5);
       dynamArr.add("A");
       dynamArr.add("B");
       dynamArr.add("C");
       dynamArr.add("D");
       dynamArr.add("E");
       dynamArr.add("F");



       dynamArr.delete("A");
       dynamArr.delete("B");
       dynamArr.delete("E");

       //dynamArr.insert(0, "P");
      //System.out.println(dynamArr.search("B"));


        System.out.println(dynamArr);
        System.out.println("capacity: "+dynamArr.capacity);
        System.out.println("size: " +dynamArr.size);
        System.out.println("empty: "+dynamArr.isEmpty());

        
    }
    
}
