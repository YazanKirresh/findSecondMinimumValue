import java.util.Arrays;

public class Main {
    public static int findLucky( int [] arrayOfIntegers  ) {
        int arrayLength =  arrayOfIntegers.length;
        Arrays.sort(arrayOfIntegers);
        int value =0;
        while (arrayLength > 0){
            for (int i = arrayLength-1; i > -1; i--){
                System.out.println("i = " +i);
                value = arrayOfIntegers[i];
                System.out.println("value = " + value);
                try{
                    if (arrayOfIntegers[i] ==  arrayOfIntegers[i-value]){
                        // not lucky
                    }else                 if (arrayOfIntegers[i] ==  arrayOfIntegers[i-value+1]){
                        return arrayOfIntegers[i];
                    }
                }
                catch (Exception e) {
                // OutOfBoundsException  
                }
            }
            arrayLength--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array= {2,2,2,3,3};
        int luckyInteger = findLucky(array);
        if (luckyInteger == -1){
            System.out.println("Couldn't find a lucky integer in the provided array ;(");
        }else {
            System.out.println( "The lucky number is: " + luckyInteger);
        }
    }
}

/*
 * To use the solution on leetcode , please paste the following:
 * 
 * class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int arrayLength =  arr.length;
        while (arrayLength > 0){
            for (int i = arrayLength-1; i > 0; i--){
                System.out.println("i = " +i);
                value = arr[i];
                System.out.println("value = " + value);
                if (arr[i] ==  arr[i-value+1]){
                    return arr[i];
                }
            }
            arrayLength--;
        }
        return -1;
} 
 * 
 */