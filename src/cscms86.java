import java.util.Scanner;
public class cscms86 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(multi(a,b));
    }
    public static int multi(int a, int b){
        while (b > 1){
            return a + multi(a, b -1);
        }
        return a;
    }
}
