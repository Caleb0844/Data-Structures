package BinarySearch;

//import java.util.Arrays;
//binary search == a searh algorithm that finds the position of target values within a sorted array half of the array is eliminated with each step

public class Main {
    public static void main(String[] args){

    int[] array = new int[1000000];
    int target = 777777;

    for(int i = 0; i < array.length;i++){
        array[i] = i;
    }

   // int index = Arrays.binarySearch(array, target);
   int index = binarySearch(array, target);

    if(index == -1){
        System.out.println(target +" not found");
    }
    else{
        System.out.println("Element found at index: "+index);
    }
    
}

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high =(array.length - 1);

        while (low <= high) {
            int middle = low + (high - low)/2;
            int value = middle;
            System.out.println("high: "+high);
            System.out.println("middle: "+ value);
            System.out.println("low: "+low);

            if(array[middle] < target) low = middle + 1;
            else if(array[middle] > target) high = middle - 1;
            else return middle;
        }

        return -1;
    }
}
