
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int min = array[0];
        for(int i:array){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallestIdx = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]<array[smallestIdx]){
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallestIdx = startIndex;
        for(int i=startIndex;i<table.length;i++){
            if(table[i]<table[smallestIdx]){
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            int toSwap = indexOfSmallestFrom(array, i);
            swap(array, i,toSwap);
            System.out.println(Arrays.toString(array));
        }
    }

}
