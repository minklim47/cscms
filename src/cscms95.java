import java.util.Scanner;
public class cscms95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        double rowSum[] = new double[row];
        double colSum[] = new double[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++){
            double sum = 0;
            for (int j = 0; j < col; j++){
                sum += arr[i][j];
            }
            rowSum[i] = sum / col;
        }
        for (int j = 0; j < col; j++){
            double sum = 0;
            for (int i = 0; i < row; i++){
                sum += arr[i][j];
            }
            colSum[j] = sum / row;
        }
        System.out.println("Average of each row:");
        for (int i = 0; i < row; i++){
         //   System.out.print(rowSum[i]);
           System.out.print(String.format("%.2f",rowSum[i]));
            if (i != row -1)
                System.out.print(" ");
        }
        System.out.println();
        System.out.println("Average of each column:");
        for (int i = 0; i < col; i++){
           // System.out.print(colSum[i]);
           System.out.print(String.format("%.2f",colSum[i]));
            if (i != col -1)
                System.out.print(" ");
        }
    }
}
