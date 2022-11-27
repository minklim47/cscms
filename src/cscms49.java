import java.util.Scanner;
public class cscms49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,j;
        i = 0;
        String str1 = str.toLowerCase();
        while (i < str1.length()){
            //System.out.println("i = " + i);
            j = i + 1;
            while (j < str1.length()){
                //System.out.println("j = " + j);
                if ((str1.charAt(i) == str1.charAt(j)) && (str1.charAt(i) != ' ' && str1.charAt(i) != '-')) {
                    System.out.println(str + " is not an isogram");
                    return;
                }
                j++;
            }
            i++;
        }
        System.out.println(str + " is an isogram");

    }
}
