import java.util.Scanner;
public class cscms30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j;
        for (int i = 0; i < n; i++) {
            j = n - i;
            while (j > 0) {
                System.out.print('*');
                j--;
            }
            System.out.println();
        }
    }
}
