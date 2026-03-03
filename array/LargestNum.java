// LArgest Numbers----------------------------
// package array;
// import java.util.*;

// public class LargestNum {
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++) {
//             if(largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1,2,6,7,0,9,3,8};
//         System.out.println("largest value is:"+getLargest(numbers));
//     }
    
// }

// Smallest Number-----------------------------

// package array;
import java.util.*;

public class LargestNum {
    public static int getSmallest(int numbers[]) {
        int Smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(Smallest > numbers[i]) {
               Smallest= numbers[i];
            }
        }
        return Smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,7,0,9,3,8};
        System.out.println("Smalles value is:"+getSmallest(numbers));
    }
    
}

