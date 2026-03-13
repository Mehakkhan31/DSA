//Find the sum of this series
// 1-2+3-4..

package Practice_Questions;

public class SeriesSum {
    public static void main(String[] args) {
        int n = 1-2+3-4;
        int sum = 0;

        for(int i = 1; i<=5; i++){
            if(i % 2 == 0){
                sum = sum - i; //odd
            }else{
                sum = sum + i; //even
            }
           
        }
        System.out.println("series sum is "+ sum);
    }
    
}
