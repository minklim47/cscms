import java.util.Scanner;
import java.util.Arrays;
public class cscms79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        float sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        Arrays.sort(arr);
        float max = arr[n - 1];
        float min = arr[0];
        float ave = sum / n;
        System.out.println("Summation: " + String.format("%.2f",sum));
        System.out.println("Average " + String.format("%.2f",ave));
        System.out.println("Max: " + String.format("%.2f",max));
        System.out.println("Min: " + String.format("%.2f",min));

    }
}
