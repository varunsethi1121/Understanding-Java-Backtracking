package BACKTRACKING;
import java.util.*;
public class backtrackingInAnArray {
    public static void printArray(int sampleArray[]){
        for(int i=0;i<sampleArray.length;i++){
            System.out.print(sampleArray[i] + " ");
        }
        System.out.println();
    }
    public static void arrayBacktracking(int array[], int si, int val){
        if(si == array.length){
            System.out.print("Array before backtracking => ");
            printArray(array);
            return;
        }
        array[si] = val;
        arrayBacktracking(array,si+1,val+1);
        array[si] = array[si] - 2;

    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Array Size: ");
            int arraySize = sc.nextInt();
            int sampleArray[] = new int[arraySize];
            arrayBacktracking(sampleArray,0,1);
            System.out.print("Array after backtracking => ");
            printArray(sampleArray);
        }
    }
}
