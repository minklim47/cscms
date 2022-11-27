import java.util.Scanner;
public class cscms29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        for (int i = 0; i < str.length(); i++){
            if (i % n == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
