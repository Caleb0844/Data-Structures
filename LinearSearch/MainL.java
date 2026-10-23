package LinearSearch;

public class MainL{
    public static void main(String[] args) {
        int[] arraynums = {7, 6, 5, 9, 8, 4, 1, 3, 2};
        long startTime = System.nanoTime();
        int serval = linearSearch(arraynums, 4);
        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;

        if(serval != -1){
            System.out.println("Found at index: " + serval);
        }
        else{
            System.out.println("Not Found");
        }

        System.out.println("Search took: " + timeTaken + " ns");
        System.out.println("Search took: " + (timeTaken / 1_000_000.0) + " ms");
    }
    
    private static int linearSearch(int[] arraynums, int serval) {
        for(int i = 0;i<arraynums.length;i++){
            if(arraynums[i] == serval){
                return i;
            }
        }
        return -1;
    }
}