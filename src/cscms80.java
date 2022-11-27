import java.util.Scanner;
public class cscms80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        System.out.println(Integer.toString(Integer.parseInt(str, 10), 8));

    }
}
