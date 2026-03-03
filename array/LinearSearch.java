// package array;
// import java.util.*;

// public class LinearSearch {
//     public static int linear(int numbers[], int key) {

//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i] == key){
//                 return i;
//             }

//         }
//         return -1;

//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 5, 6, 7, 8, 9, 10, 11, 34};
//         int key = 10;

//         int index = linear(numbers, key);
//         if(index == -1) {
//             System.out.println("NOT FOUND");
//         }else {
//             System.out.println("key is at index :"+index);
//         }

//     }
    
    
// }

// package array;
import java.util.*;

public class LinearSearch {
    public static String linear(String menu[], String key) {
        
        for(int i=0; i<menu.length; i++) {
            if(menu[i].equals(key)){
                return String.valueOf(i);
            }

        }
        return "-1";

    }

    
    public static void main(String args[]) {
                String menu[] = {"dosa",  "wada pav", "chawal"};
                String key = "chawal";
        
                String index = linear(menu, key);
                if(index == "-1") {
                    System.out.println("NOT FOUND");
                }else {
                    System.out.println("key is at index :"+index);
                }
            }
        }
