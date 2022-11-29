import java.util.Scanner;
public class cscms68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String arr[] = new String[num];
        for (int i = 0; i < num; i++){
            arr[i] = sc.next();
        }
        int max = 0;
        for (int i = 0; i < num; i++){
            if (arr[i].length() > max){
                max = arr[i].length();
            }
        }
        for (int i = 0; i < max; i++){
            for (int j = 0; j < num ; j++){
                if (arr[j].length() <= i){
                    System.out.print("  ");
                }
                else {
                    System.out.print(arr[j].charAt(i));
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
