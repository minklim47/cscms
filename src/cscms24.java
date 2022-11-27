import java.util.Scanner;
import java.util.ArrayList;
public class cscms24 {
    public static void main(String[] args) {
        // DONT FORGET TO INCLUDE java.util.ArrayList
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                arr.add(i);
                count++;
            }
        }
        if (count == 0){
            System.out.println("ERROR");
            return;
        }
        System.out.println(count);
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i));
            if (i != arr.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
