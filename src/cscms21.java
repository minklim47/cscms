import java.util.Scanner;
public class cscms21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j;
        while (i < n){
            j = 0;
            while(j < n){
                if (j <= i)
                    System.out.print("*");
                j++;
            }
            System.out.print('\n');
            i++;
        }
    }
}
