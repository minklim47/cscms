import java.util.*;
public class cscms3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 1;
        int n = sc.nextInt();
        while (n >= 1 && n <= 20){
            ans *= n;
            n--;
        }
        System.out.println(ans);
    }
}
