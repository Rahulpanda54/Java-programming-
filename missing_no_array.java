public class missing_no_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int sum1 = 0;
        for(int i=0;i<arr.length;i++){
            sum1 = sum1 + arr[i];
        }
        int sum2 = 0;
        for(int i=1;i<=5;i++){
            sum2 = sum2 + i;
        }
        System.out.println("the missing number is: " + (sum2-sum1));
    }
    
}
