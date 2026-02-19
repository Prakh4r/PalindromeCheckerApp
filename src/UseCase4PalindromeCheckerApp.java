import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String s = sc.next();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        boolean isPalindrome = true;
        while(i < j){
            if(arr[i] != arr[j]){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println(s + " is a Palindrome");
        }else{
            System.out.println(s + " is not a Palindrome");
        }
    }
}
