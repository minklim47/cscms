import java.util.Scanner;
public class cscms33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int y = n;
        for (int i = 1; i <= (n * 2) - 1; i++){
            if (i <= n){
                for (int j = 1; j <= (n * 2) - 1; j++){
                    if (i + j >= n + 1 && j - i <= n - 1){
                        System.out.print('*');
                    }
                    else {
                        System.out.print('-');
                    }
                }
            }
            else{
                for (int j = 1; j <= (n * 2) - 1; j++){
                    if (i - j <= n - 1 && i + j <= (3 * n) - 1){
                        System.out.print('*');
                    }
                    else {
                        System.out.print('-');
                    }
                }
            }
            System.out.println();
        }

    }
}
