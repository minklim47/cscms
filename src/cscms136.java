import java.util.Scanner;
public class cscms136{
    public static String binary(int a) {
        while (a > 0){
            return binary(a/2) + (a % 2);
        }
        return "";
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            String ans = binary(a);
            System.out.println(ans);
    }
}

