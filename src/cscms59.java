import java.util.Scanner;
public class cscms59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int day = sc.nextInt();
        int[] bucket = new int[n];
        int x, y;
        for (int i = 0; i < day; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            for (int j = x - 1; j < y; j++){
                bucket[j]++;
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(bucket[i] + " ");
        }
    }
}
