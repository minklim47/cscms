import java.util.Scanner;
public class cscms10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;
        int j;
        while (i < n){
            j = 0;
            while (j < m){
                if (i == 0 || i == n - 1){
                    System.out.print("*");
                }
                else if (j == 0 || j == m - 1 ){
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
                j++;
            }
            System.out.print('\n');
            i++;
        }

    }
}
