import java.util.Scanner;
public class cscms25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int big, small;
        if (n1 > n2){
            big = n1;
            small = n2;
        }
        else {
            big = n2;
            small = n1;
        }
        int j = 0;
        int i = 0;
        while (i <= big - small){
            j = 0;
            while (j <= i){
                System.out.print(big - j);
                if (i != big - small || j != i)
                    System.out.print(" ");
                j++;
            }
            i++;
        }
    }
}
