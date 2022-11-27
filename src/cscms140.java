import java.util.Scanner;
public class cscms140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++){
            words[i] = sc.next();
        }
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                for (int j = 0; j < words[i].length(); j++){
                    System.out.print(words[i].charAt(j));
                }
            }
            else {
                for (int j = words[i].length() - 1; j >= 0; j--){
                    System.out.print(words[i].charAt(j));
                }
            }
            if (i != n - 1)
                System.out.print(" ");
        }
    }
}
