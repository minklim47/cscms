import java.util.*;
public class cscms2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String needle = "";
        String hay = "";
        if (str1.length() < str2.length()){
            needle += str1;
            hay += str2;
        }
        else {
            needle += str2;
            hay += str1;
        }
        System.out.println(hay.replaceAll(needle,""));
    }
}
