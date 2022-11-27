import java.util.Scanner;
public class cscms14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int year, day;
        year = n / (60 * 24 * 365);
        n = n % (60 * 24 * 365);
        day = n / (60 * 24);
        System.out.print(year + " " + day);
    }
}
