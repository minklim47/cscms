import java.util.Scanner;
import java.util.Arrays;
public class cscms92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float arr[] = new float[num];
        for (int i = 0; i < num; i++){
            arr[i] = sc.nextFloat();
        }
        Arrays.sort(arr);
        System.out.print(String.format("%.02f", arr[1]) + " ");
        System.out.print(String.format("%.02f", arr[arr.length - 2]));
    }
}
