import java.util.Scanner;
public class cscms8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j;
        while (i < n){
            j = 0;
            while (j < n){
                if ((i == 0 && j == 0) || (i == n-1 && j == n-1) || (i == 0 && j == n-1) || (i == n-1 && j == 0)){
                    System.out.print("_");
                }
                else
                    System.out.print("*");
                j++;
            }
            System.out.print('\n');
            i++;
        }
    }
}
