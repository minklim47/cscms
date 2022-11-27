import java.util.Scanner;
public class cscms81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String front = "";
        String back = "";
        for (int i = 0; i < str.length(); i++) {
            front += str.charAt(i);
        }
        for (int i = str.length() - 1;i >= 0 ; i--){
            back += str.charAt(i);
        }
        if (back.equals(front)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}