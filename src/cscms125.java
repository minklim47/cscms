import java.util.Scanner;
public class cscms125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        int n = sc.nextInt();
        if (n <= title.length()) {
            for (int i = 0; i < n + 3; i++) {
                if (i >= n) {
                    System.out.print(".");
                } else {
                    System.out.print(title.charAt(i));
                }
            }
        }
        else {
            System.out.println(title);
        }
    }
}
