import java.util.Scanner;
public class cscms6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int j;
        for (int i = 0; i < n; i++){
            j = 0;
            while (j < m){
                System.out.print("*");
                j++;
            }
            System.out.print('\n');
        }
    }
}
