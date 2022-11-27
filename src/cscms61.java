import java.util.Scanner;
public class cscms61 {
    public static void main(String[] args) {
        //=========== NOT DONE ============
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++){
            for (int j = i + 1; j < str.length(); j++) {
                String sub = str.substring(i, j);
                int repeat = 0;
                for (int m = 0; m < sub.length() - 1; m++){
                    for (int n = m + 1; n < sub.length(); n++){
                        if (sub.charAt(m) == sub.charAt(n)){
                            repeat = 1;
                        }
                    }

                }
                if (repeat == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
