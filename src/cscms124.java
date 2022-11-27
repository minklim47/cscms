import java.util.Scanner;
import java.util.Arrays;
public class cscms124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.nextLine();
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++){
            arr1[i] = sc.nextInt();
        }
        sc.nextLine();
        String p2 = sc.nextLine();
        int[] arr2 = new int[3];
        for (int i = 0; i < 3; i++){
            arr2[i] = sc.nextInt();
        }
        int score1 = 0;
        int score2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] arrsort1 = {arr1[2], arr1[0], arr1[1]};
        int[] arrsort2 = {arr2[2], arr2[0], arr2[1]};

        for (int i = 0; i < 3; i++){
            if (arrsort1[i] > arrsort2[i]){
                score1 += 1;
            }
            else if (arrsort1[i] < arrsort2[i]){
                score2 += 1;
            }
            if (i == 1 && (score1 == 2 || score2 == 2)){
                if (score1 == 2)
                    System.out.print("Perfect Win (" + p1 + ")");
                else
                    System.out.print("Perfect Win (" + p2 + ")");
                return;
            }
        }
        if (score1 > score2){
            System.out.print("Win (" + p1 + ")");
        }
        else if (score1 < score2){
            System.out.print("Win ( " + p2 + ")");
        }
        else{
            System.out.print("Draw");
        }
    }
}
