import java.util.Scanner;

public class cscms93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String arr[] = new String[num];
        for (int i = 0; i < num; i++){
            arr[i] = sc.next();
        }
        for (int i = 0; i < num; i++){
            String rev = "";
            for (int j = arr[i].length() - 1; j >= 0; j--){
                rev += arr[i].charAt(j);
            }
            arr[i] = rev.substring(0,1).toUpperCase() + rev.substring(1).toLowerCase();
            System.out.print(arr[i] + " ");
        }

    }
}
