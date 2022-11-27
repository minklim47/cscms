import java.util.Scanner;
public class cscms45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String repeat = "";
        String ans = "";
        int count;
        for (int i = 0; i < str.length() - 1; i++){
            count = 0;
            for (int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count != 0){
                repeat += str.charAt(i);
            }
        }
        int x = 0;
        for (int i = 0; i < str.length(); i++){
            x = 0;
            for (int j = 0; j < repeat.length(); j++){
                if (str.charAt(i) == repeat.charAt(j)) {
                    ans += "-";
                    x = 1;
                    break;
                }
            }
            if (x == 0){
                ans += "*";
            }
        }
        System.out.println(ans);
    }

}
