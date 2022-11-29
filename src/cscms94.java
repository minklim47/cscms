import java.util.Arrays;
import java.util.Scanner;
public class cscms94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        double temp;
        for (int i = 0; i <= n / 2; i+=2){
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++){
            System.out.printf("%.2f ", arr[i]);
        }
    }
}
