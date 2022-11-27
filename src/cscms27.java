import java.util.Scanner;
import java.util.Arrays;
public class cscms27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;
        int[] score = new int[n];

        for (int i = 0; i < n; i++){
            score[i] = sc.nextInt();
        }
        int[] sort = new int[n];
        for (int i = 0; i < n; i++){
            sort[i] = score[i];
        }
        Arrays.sort(sort);
        double a = (90 * (n + 1))/100;
        double b = (70 * (n + 1))/100;
        double c = (50 * (n + 1))/100;
        double d = (30 * (n + 1))/100;
        double e = (10 * (n + 1))/100;

        int A,B,C,D,E;
        if (a - (int)a != 0)
            A = (int)a;
        else
            A = (int)a - 1;
        if (b - (int)b != 0)
            B = (int)b;
        else
            B = (int)b - 1;
        if (c - (int)c != 0)
            C = (int)c;
        else
            C = (int)c - 1;
        if (d - (int)d != 0)
            D = (int)d;
        else
            D = (int)d - 1;
        if (e - (int)e != 0)
            E = (int)e;
        else
            E = (int)e - 1;
        int scoreA = sort[A];
        int scoreB = sort[B];
        int scoreC = sort[C];
        int scoreD = sort[D];
        int scoreE = sort[E];

        for (int i = 0; i < n; i++){
            if (score[i] >= scoreA)
                System.out.print("A ");
            else if (score[i] >= scoreB){
                System.out.print("B ");
            }
            else if (score[i] >= scoreC){
                System.out.print("C ");
            }
            else if (score[i] >= scoreD){
                System.out.print("D ");
            }
            else if (score[i] >= scoreE){
                System.out.print("E ");
            }
            else{
                System.out.print("F ");
            }
        }
    }
}
