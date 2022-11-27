import java.util.Scanner;
public class cscms123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if (str1.equals(str2))
            System.out.println("Perfect Match");
        else if (str1.equalsIgnoreCase(str2))
            System.out.println("Partial Match");

        else if (str1.matches("(?i).*" + str2 + ".*") || str2.matches("(?i).*" + str1 + ".*"))
            System.out.println("Partial Match");
        else
            System.out.println("Not Match");
    }
}
