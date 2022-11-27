import java.util.Scanner;
public class cscms47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sw = 0;
        int sd = 0;
        int hel = 0;
        while (n > 2) {
            if (n >= 10) {
                sw ++;
                n -= 10;
            }
            if (n >= 8) {
                sd ++;
                n -= 8;
            }
            if (n >= 3) {
                hel ++;
                n -= 3;
            }
        }
        System.out.println(sw + " " + sd + " " + hel + " " + n);
    }
}
