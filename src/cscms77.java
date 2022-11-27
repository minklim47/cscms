import java.util.Scanner;
public class cscms77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int pay = sc.nextInt();
        if (pay < price)
            System.out.println("Not enough money.");
        else if (pay == price)
            System.out.println("No change for you.");
        else {
            int change = pay - price;
            System.out.println("Change: " + (change));
            if (change >= 1000) {
                System.out.println("1000THB: " + (change / 1000));
                change = change % 1000;
            } else
                System.out.println("1000THB: 0");
            if (change >= 500) {
                System.out.println("500THB: " + (change / 500));
                change = change % 500;
            } else
                System.out.println("500THB: 0");
            if (change >= 100) {
                System.out.println("100THB: " + (change / 100));
                change = change % 100;
            } else
                System.out.println("100THB: 0");
            if (change >= 50) {
                System.out.println("50THB: " + (change / 50));
                change = change % 50;
            } else
                System.out.println("50THB: 0");
            if (change >= 20) {
                System.out.println("20THB: " + (change / 20));
                change = change % 20;
            } else
                System.out.println("20THB: 0");
            if (change >= 10) {
                System.out.println("10THB: " + (change / 10));
                change = change % 10;
            } else
                System.out.println("10THB: 0");
            if (change >= 5) {
                System.out.println("5THB: " + (change / 5));
                change = change % 5;
            } else
                System.out.println("5THB: 0");
            if (change >= 2) {
                System.out.println("2THB: " + (change / 2));
                change = change % 2;
            } else
                System.out.println("2THB: 0");
            System.out.println("1THB: " + change);
        }

    }
}
