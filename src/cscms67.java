import java.util.Scanner;

public class cscms67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int blocks[] = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++){
            if ((i + 1) % 15 == 0){
                blocks[i] = (i + 1) * 10;
            }
            else if ((i + 1) % 5 == 0){
                blocks[i] = (i + 1) * 3;
            }
            else if ((i + 1) % 3 == 0){
                blocks[i] = (i + 1) * 2;
            }
            else{
                blocks[i] = (i + 1);
            }
        }
        for (int i = 0; i < num; i++){
            sum += blocks[i];
        }
        System.out.println(sum);
    }
}
