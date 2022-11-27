import java.util.Scanner;
public class cscms52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        if (str.length() % 2 == 0){
            for (int i = n/2 - 1; i >= 0; i--){
                System.out.print(str.charAt(i));
            }
            for (int i = n - 1; i >= n/2; i--){
                System.out.print(str.charAt(i));
            }
        }
        else{
            for (int i = n/2 - 1; i >= 0; i--){
                System.out.print(str.charAt(i));
            }
            System.out.print(str.charAt(n/2));
            for (int i = n - 1; i > n/2; i--){
                System.out.print(str.charAt(i));
            }
        }
    }
}
