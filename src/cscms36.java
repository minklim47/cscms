import java.util.Scanner;
public class cscms36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= (n * 3)+1; i++){
            for (int j = 1; j <= (n * 3) + 1; j++){
                if (i <= (n*2) + 1 && j == n + 1){
                    System.out.print("*");
                }
                else if (i == n + 1 && j <= (n * 2) + 1){
                    System.out.print("*");
                }
                else if (j == (n * 2) + 1 && i >= n + 1){
                    System.out.print("*");
                }
                else if (i == (n * 2) + 1 && j >= n + 1){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
