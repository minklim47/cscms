import java.util.Scanner;
public class cscms51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] rubik = {
                {   {1,10,19},
                        {2,11,20},
                        {3,12,21}
                },
                {   {4,13,22},
                        {5,14,23},
                        {6,15,24}
                },
                {   {7,16,25},
                        {8,17,26},
                        {9,18,27}}
        };
        int n = sc.nextInt();
        String[] di = new String[n];
        int[] index = new int[n];
        for (int i = 0; i < n; i++){
            di[i] = sc.next();
            index[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (di[i].equals("up")) {
                rubik = up(rubik, index[i]);
            }
            else if (di[i].equals("down")) {
                rubik = down(rubik, index[i]);
            }
            else if (di[i].equals("right")){
                rubik = right(rubik, index[i]);
            }
            else if (di[i].equals("left")){
                rubik = left(rubik, index[i]);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(rubik[i][j][0]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int[][][] up(int[][][] rubik, int i){
        int[][][] rubikcpy = new int[3][3][3];
        rubikcpy = copy(rubik);

        rubik[0][i][0] = rubikcpy[2][i][0];
        rubik[1][i][0] = rubikcpy[2][i][1];
        rubik[2][i][0] = rubikcpy[2][i][2];

        rubik[0][i][1] = rubikcpy[1][i][0];
        rubik[1][i][1] = rubikcpy[1][i][1];
        rubik[2][i][1] = rubikcpy[1][i][2];

        rubik[0][i][2] = rubikcpy[0][i][0];
        rubik[1][i][2] = rubikcpy[0][i][1];
        rubik[2][i][2] = rubikcpy[0][i][2];

        return rubik;
    }
    public static int[][][] down(int[][][] rubik, int i){
        int[][][] rubikcpy = new int[3][3][3];
        rubikcpy = copy(rubik);

        rubik[0][i][0] = rubikcpy[0][i][2];
        rubik[1][i][0] = rubikcpy[0][i][1];
        rubik[2][i][0] = rubikcpy[0][i][0];

        rubik[0][i][1] = rubikcpy[1][i][2];
        rubik[1][i][1] = rubikcpy[1][i][1];
        rubik[2][i][1] = rubikcpy[1][i][0];

        rubik[0][i][2] = rubikcpy[2][i][2];
        rubik[1][i][2] = rubikcpy[2][i][1];
        rubik[2][i][2] = rubikcpy[2][i][0];

        return rubik;
    }

    public static int[][][] left(int[][][] rubik, int i){
        int[][][] rubikcpy = new int[3][3][3];
        rubikcpy = copy(rubik);

        rubik[i][0][0] = rubikcpy[i][2][0];
        rubik[i][0][1] = rubikcpy[i][1][0];
        rubik[i][0][2] = rubikcpy[i][0][0];

        rubik[i][1][0] = rubikcpy[i][2][1];
        rubik[i][1][1] = rubikcpy[i][1][1];
        rubik[i][1][2] = rubikcpy[i][0][1];

        rubik[i][2][0] = rubikcpy[i][2][2];
        rubik[i][2][1] = rubikcpy[i][1][2];
        rubik[i][2][2] = rubikcpy[i][0][2];

        return rubik;
    }
    public static int[][][] right(int[][][] rubik, int i){
        int[][][] rubikcpy = new int[3][3][3];
        rubikcpy = copy(rubik);

        rubik[i][0][0] = rubikcpy[i][0][2];
        rubik[i][0][1] = rubikcpy[i][1][2];
        rubik[i][0][2] = rubikcpy[i][2][2];

        rubik[i][1][0] = rubikcpy[i][0][1];
        rubik[i][1][1] = rubikcpy[i][1][1];
        rubik[i][1][2] = rubikcpy[i][2][1];

        rubik[i][2][0] = rubikcpy[i][0][0];
        rubik[i][2][1] = rubikcpy[i][1][0];
        rubik[i][2][2] = rubikcpy[i][2][0];

        return rubik;
    }

    public static int[][][] copy(int[][][] rubik){
        int[][][] rubikcpy = new int[3][3][3];
        for (int m = 0; m < 3; m++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    rubikcpy[m][j][k] = rubik[m][j][k];
                }
            }
        }
        return rubikcpy;
    }
}
