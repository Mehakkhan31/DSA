//  calculate the sum of digits n

package Practice_Questions;

public class Sum {
    public static void main(String[] args) {
        int n = 765;
        int sum = 0;

        while(n > 0){
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println("sum is "+ sum);
    }
    
}
