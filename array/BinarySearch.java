package array;
import java.util.*;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
       


        while(start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int numbers[] = {2,4,6,8,9,10};
        System.out.print("Enter key: ");
        int key = sc.nextInt(); 
        

        System.out.println("index for key is "+binarySearch(numbers, key));
    }   
}
