import java.util.Scanner;
public class cscms75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        if (x.equalsIgnoreCase(y)){
            System.out.println("Draw");
        }
        else if (x.equalsIgnoreCase("scissors")){
            if (y.equalsIgnoreCase("paper")){
                System.out.println("Mr.Ukrit Ruckcharti");
            }
            else if (y.equalsIgnoreCase("rock")){
                System.out.println("Dr.Worarat Krathu");
            }
        }
        else if (x.equalsIgnoreCase("paper")){
            if (y.equalsIgnoreCase("scissors")){
                System.out.println("Dr.Worarat Krathu");
            }
            else if (y.equalsIgnoreCase("rock")){
                System.out.println("Mr.Ukrit Ruckcharti");
            }
        }
        else if (x.equalsIgnoreCase("rock")){
            if (y.equalsIgnoreCase("scissors")){
                System.out.println("Mr.Ukrit Ruckcharti");
            }
            else if (y.equalsIgnoreCase("paper")){
                System.out.println("Dr.Worarat Krathu");
            }
        }
    }
}
