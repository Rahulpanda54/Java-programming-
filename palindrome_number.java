public class palindrome_number{

  public static boolean palindrome(int n){

       return n == reverse(n);
  }

  public static int reverse(int n){

     int rev = 0;

     while(n > 0){

        int rem = n%10;
        rev = rev*10 + rem;
        n = n/10;   
     }
        return rev;
  }


public static void main(String[] args){

    int n = 121;
    if(palindrome(n)){

        System.out.println("Number is palindrome");
    }
    else{
           System.out.println("Number is not a palindrome : ");
    }
  }
}