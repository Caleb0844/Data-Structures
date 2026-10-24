package interpolationsearch;

public class Main {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7,8,9};

        int index = interpolationsearch(array, 4);

        if(index != -1){
            System.out.println("Element found at index: "+index);
        }else{
            System.out.println("Element not found!");
        }
    
    }
    private static int interpolationsearch(int[] array, int value) {
        int high = array.length -1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high){
            int prolly = low + (high - low)* (array[low]) /(array[high] - array[low]);

            System.out.println("probe: " + prolly);

            if(array[prolly] == value){
                return prolly;
                    }
            else if(array[prolly] < value){
                low = prolly + 1;
            }
            else {
                high = prolly -1;
            }
            

        } 
        return -1;
    }

}
