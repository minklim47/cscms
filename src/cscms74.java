import java.util.Scanner;
public class cscms74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next().toLowerCase();
        String last = sc.next().toLowerCase();
        String first2 = first.substring(0,1).toUpperCase() + first.substring(1);
        String last2 = last.substring(0,1).toUpperCase() + last.substring(1);
        System.out.println(first2 + " " + last2);
    }
}
