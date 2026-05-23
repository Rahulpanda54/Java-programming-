public class recursion2 {
    public static void fibonacci_reverse(int n,int a,int b){
        if(n>0){
            fibonacci_reverse(n-1, b, a + b);

            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        
        int n = 10;

        fibonacci_reverse(n, 0, 1);
        
    }
    
}
