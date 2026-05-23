public class string_palindrome {
        public static boolean isplaindrome(String str){
            for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i) == str.charAt(str.length()-i-1))
                    return true;
            }
            return false;
        }
        public static void main(String[] args) {
            String str = "abccba";
            if(isplaindrome(str) == false){
                System.out.println("string is not an palindrome:");
            }
            else{
                System.out.println("string is palindrome: ");
            }
        }
    }