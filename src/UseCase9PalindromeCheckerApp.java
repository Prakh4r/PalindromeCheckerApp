import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = check(s, 0, s.length() - 1);
        System.out.println(ans);
    }
    public static boolean check(String s, int i, int j){
        if(i>j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return check(s, ++i, --j);
    }
}
