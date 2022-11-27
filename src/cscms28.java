import java.util.Scanner;
public class cscms28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int n2 = sc.nextInt();
        long ans;
        switch (op){
            case '+':
                ans = n1 + n2;
                System.out.println(ans);
                break;
            case '-':
                ans = n1 - n2;
                System.out.println(ans);
                break;
            case '*':
                ans = n1 * n2;
                System.out.println(ans);
                break;
            case '/':
                if(n2 == 0){
                    System.out.println("error");
                    return;
                }
                ans = n1 / n2;
                System.out.println(ans);
                break;
            case '%':
                if(n2 == 0){
                    System.out.println("error");
                    return;
                }
                ans = n1 % n2;
                System.out.println(ans);
                break;

            default:
                System.out.println("error");
                break;
        }
    }
}
