import java.util.Scanner;
public class cscms22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                sum += str.charAt(i) - 96 - i;
            }
        }
        System.out.println(sum);
    }
}
