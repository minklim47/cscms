import java.util.Scanner;
public class cscms71 {
    public static void main(String[] args){
        //============ MAI PANNNNN =========
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = binary(a);
        System.out.println(b);
    }
    public static String binary(int a){
        while (a > 0){
            return binary(a / 2) + (a % 2);
        }
        return "";
    }
}
