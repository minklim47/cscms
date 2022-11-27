import java.util.Scanner;
public class cscms9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nbomb = sc.nextInt();
        int i = 1;
        if (n <=3 && n - nbomb <= 1) {
            System.out.println("DIE");
            return;
        }
        while (i <= n) {
            if (!(i >= nbomb - 1 && i <= nbomb + 1)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
