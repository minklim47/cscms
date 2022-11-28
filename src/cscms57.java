import java.util.Scanner;
public class cscms57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int qarr[] = new int[q];
        for (int i = 0; i < q; i++) {
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            int sum = 0;
            for (int j = q1; j <= q2; j++) {
                sum += arr[j];
            }
            qarr[i] = sum;
        }
        for (int i = 0; i < q; i++){
            System.out.println(qarr[i]);
        }
    }
}
