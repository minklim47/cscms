import java.util.Scanner;
public class cscms31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = n - i; j >= 1; j--){
                System.out.print('_');
            }
            for (int k = 0; k < i; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
