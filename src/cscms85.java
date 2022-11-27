import java.util.Scanner;
public class cscms85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        int[][] arr= new int[h][l];
        for (int i = 0; i < h; i++){
            for (int j = 0; j < l; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < l; i++){
            for (int j = 0; j < h; j++){
                System.out.print(arr[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
