import java.util.Scanner;
public class cscms83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < x + 1; i++){
            for (int j = 0; j < y * 2 + 1; j++){
                if (j % 2 == 0){
                    if (i != 0)
                        System.out.print("|");
                    else if (i == 0)
                        System.out.print("*");
                    else if (i == 1)
                        System.out.print("_");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
