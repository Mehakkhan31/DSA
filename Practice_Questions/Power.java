//Given 2 numbers a and b . find a raise to the power b.

package Practice_Questions;

public class Power {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int num = 1;
        for(int i = 1; i<=b; i++){
            num = num * a;
        }
        System.out.println("A raise to the power b is" + " "+ num);
    }
    
}
