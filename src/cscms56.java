import java.util.Scanner;
public class cscms56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if (arr[0] >= arr[1])
            System.out.print(arr[0] + " ");
        for (int i = 1; i < n - 2 ; i++){
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]){
                System.out.print(arr[i] + " ");
            }
        }
        if (arr[n-1] >= arr[n - 2])
            System.out.print(arr[n - 1] + " ");
    }
}
