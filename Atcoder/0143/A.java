import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // �錾
        Scanner sc = new Scanner(System.in);
        // ���͒l�擾
        int a = sc.nextInt();
        int b = sc.nextInt() * 2;
        
        int ans = a - b;
        
        // ans < 0 �̏ꍇ0����
        if(ans < 0){
            ans = 0;
        }
        System.out.println(ans);
    }
}
