package NumberSystem;

public class DecimaltoBinary{
    public static void main(String[] args) {
        int decimal_num = 15;
        int ans = 0;
        int pw = 1; //power of 10 

        while(decimal_num > 0 ){
            int parity = decimal_num % 2;
            ans += (parity * pw);
            decimal_num /= 2;
            pw *= 10;
        }
        System.out.println(ans);
 }
        
    }
    


