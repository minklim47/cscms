import java.util.Scanner;
public class cscms60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int day = sc.nextInt();
        int[] bucket = new int[n];
        int x, y;
        int[][] arr = new int[day][2];
        for (int i = 0; i < day; i++){
            for (int j = 0; j <= 1; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < day; i++){
            for (int j = arr[i][0] - 1; j < arr[i][1]; j++){
                bucket[j]++;
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(bucket[i] + " ");
        }
    }
}
