import java.util.Scanner;
public class cscms48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int onoff1 = sc.nextInt();
        int onoff2 = sc.nextInt();
        String switch1 = sc.next();
        String switch2 = sc.next();

        if (onoff1 == 0 && onoff2 == 0){
            if (switch1.equals("1") && switch2.equals("-"))
                System.out.println("MuR");
            else if (switch1.equals("-") && switch2.equals("1"))
                System.out.println("DnD");
            else
                System.out.println("NEUTRAL");
        }
        else if (onoff1 == 0 && onoff2 == 1){
            if (switch1.equals("1"))
                System.out.println("MuR");
            else if (switch2.equals("1"))
                System.out.println("NEUTRAL");
            else if (switch1.equals("-") && switch2.equals("-"))
                System.out.println("DnD");
        }
        else if ( (onoff1 == 1 && onoff2 == 0)){
            if (switch1.equals("1"))
                System.out.println("NEUTRAL");
            else if (switch2.equals("1"))
                System.out.println("DnD");
            else if (switch1.equals("-") && switch2.equals("-"))
                System.out.println("MuR");
        }
    }
}
