public class findIndexValue {
   public static void find() {
          int x = 5;
          int arr[] = {1,2,3,4,5,6,7,8,9,10};
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
            System.out.println("Index of " + x + " is: " + i);
            break;
            }

        }
    }
        public static void main(String[] args){
        find();
    }
}






