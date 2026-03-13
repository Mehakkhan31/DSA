// Count the numbers of digits for a given number n

package Practice_Questions;

public class Count {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;

        while(n > 0){
            n = n / 10;
            count++;
} 
       System.out.println(count);
    }
}
