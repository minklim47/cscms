import java.util.*;
public class cscms1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int med = 0;
        if ((a > b && a < c) || (a < b && a > c))
            med = a;
        else if ((b > a && b < c) || (b < a && b > c))
            med = b;
        else
            med = c;
        System.out.print(med);
    }
}
