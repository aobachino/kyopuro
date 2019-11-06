import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // éŒ¾
        Scanner sc = new Scanner(System.in);
        // “ü—Í’læ“¾
        int a = sc.nextInt();
        int b = sc.nextInt() * 2;
        
        int ans = a - b;
        
        // ans < 0 ‚Ìê‡0‚ğ‘ã“ü
        if(ans < 0){
            ans = 0;
        }
        System.out.println(ans);
    }
}
