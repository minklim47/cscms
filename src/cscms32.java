import java.util.Scanner;
public class cscms32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print('-');
            }
            for (int j = n; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
