import java.util.Scanner;
import java.util.Arrays;
public class cscms84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans[] = new String[n];
        for (int i = 0; i < n; i++){
            String s1 = sc.next();
            char c1[] = s1.toCharArray();
            Arrays.sort(c1);
            String s11 = new String(c1);
            String s2 = sc.next();
            char c2[] = s2.toCharArray();
            Arrays.sort(c2);
            String s22 = new String(c2);
            if (s11.equals(s22)){
                ans[i] = "Yes";
            }
            else {
                ans[i] = "No";
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(ans[i]);
        }
    }

}
