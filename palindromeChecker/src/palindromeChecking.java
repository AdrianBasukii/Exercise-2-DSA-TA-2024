import java.util.*;

public class palindromeChecking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String toBeChecked = scan.nextLine();

        boolean palindromeTrue = palindromeChecker(toBeChecked);
        if(palindromeTrue){
            System.out.println(toBeChecked+" is a palindrome");
        }else{
            System.out.println(toBeChecked+" is NOT a palindrome");
        }

    }

    public static boolean palindromeChecker(String s){
        if(s.length() <= 1){
            return true;
        }

        else if(s.charAt(0) == s.charAt(s.length() - 1)){
            return palindromeChecker(s.substring(1, s.length() - 1));
        }

        else{
            return false;
        }
        
    }
}
