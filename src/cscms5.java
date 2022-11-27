import java.util.Scanner;
public class cscms5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 2147483647) {

            if ((n % 2 == 0 && n != 2) || (n % 3 == 0 && n != 3)) {
                System.out.println("No");
                return;
            }
            if (n == 1) {
                System.out.println("No");
                return;
            }
            for (long i = 5; i <= n; i++) {
                if (n != i && n % i == 0) {
                    System.out.println("No");
                    return;
                }
                i++;
            }
            System.out.println("Yes");
        }
    }
}
