import java.util.Scanner;
import java.util.Arrays;
public class cscms38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] repeat = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] arrsort = Arrays.copyOf(arr, n);
        Arrays.sort(arrsort);
        for (int i = 0; i < arrsort.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arrsort[i] == arr[j]){
                    arr[j] = -1;
                    System.out.print(j + 1);
                    System.out.print(" ");
                }
            }
        }
    }
}
