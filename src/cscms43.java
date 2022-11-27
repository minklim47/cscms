import java.util.Scanner;
import java.util.Arrays;
public class cscms43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str2 = str.split(" ");
        int[] arr = new int[str2.length];
        for (int i = 0; i < str2.length; i++) {
            arr[i] = Integer.parseInt(str2[i]);
        }
        int[] arrsort = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrsort);
        int each;
        int med = (arrsort.length + 1) / 2;
        if ((arrsort.length + 1) % 2 != 0){
            each = (arrsort[med - 1] + arrsort[med])/2;
        }else {
            each = arrsort[med - 1];
        }
        int put = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != each) {
                put += Math.abs(each - arr[i]);
            }
        }
        System.out.println(put);

    }
}
