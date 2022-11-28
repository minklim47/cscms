import java.util.Scanner;
public class cscms87 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        System.out.println(sumDigit(a));
    }
    public static long sumDigit(long a){
        while (a > 0 ) {
            return sumDigit(a / 10) + a % 10;
        }
        return 0;
    }
}
