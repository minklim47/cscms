import java.util.Scanner;
public class cscms35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int start;
        int stop;
        int sum = 0;
        int prime;
        if (x < y){
            start = x;
            stop = y;
        }else{
            start = y;
            stop = x;
        }
        for (int i = start; i < stop; i++){
            prime = 1;
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    prime = 0;
                    break;
                }
            }
            if (prime == 1)
                sum += i;
        }
        System.out.println(sum);
    }
}
