package NumberSystem;

public class BinarytoDecimal{
    public static void main(String[] args) {
        int binary_num = 1001;
        int ans = 0;
        int pw = 1; //power of 2 = 2^0 = 1

        while(binary_num > 0 ){
            int unit_digit = binary_num % 10;
            ans += (unit_digit * pw);
            binary_num /= 10;
            pw *= 2;
        }
        System.out.println(ans);
 }
        
    }
    

