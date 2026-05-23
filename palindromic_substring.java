import java.util.*;
public class palindromic_substring{

     public static List<List<String>> palindromic_substring(String s){

         List<List<String>> ans = new ArrayList<>();
         List<String> ds = new ArrayList<>();

         solve(s, ans, ds);
         return ans;
     }

    static  void solve(String s, List<List<String>> ans, List<String> ds){

        if(s.length() == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<s.length(); i++){

            String str = s.substring(0, i+1);

            if(ispalindrome(str)){
                ds.add(str);

                solve(s.substring(i+1), ans, ds);
                ds.remove(ds.size()-1);
            }
        }
     }

    static boolean ispalindrome(String s){

        int i=0;  int j = s.length()-1;

        while(i<=j){

            if(s.charAt(i) != s.charAt(j)){
                  return false;
            }
            
            i++;  j--;
        }

        return true;
     }


    public static void main(String[] args) {
        
        String str = "aaba";

        System.out.println(palindromic_substring(str));

    }
}