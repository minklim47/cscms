import java.util.Scanner;
public class cscms69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rna = sc.nextLine();
        int l = 0;
        int p = 0;
        int h = 0;
        int g = 0;
        int a = 0;
        for (int i = 0; i < rna.length(); i += 3){
            String sub1 = rna.substring(i, i + 2);
            if (sub1.equals("CU"))
                l++;
            else if (sub1.equals("CC"))
                p++;
            else if (sub1.equals("CG"))
                a++;
            else if (sub1.equals("CA")){
                String sub2 = rna.substring(i, i+3);
                if (sub2.equals("CAU") || sub2.equals("CAC"))
                    h++;
                else if (sub2.equals("CAA") || sub2.equals("CAG"))
                    g++;
            }
        }
        System.out.println(l + " " + p + " " + h + " " + g + " " + a);

    }
}
