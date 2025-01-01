package AccenturePractice;

import java.util.*;

public class stringSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.nextLine();

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        String res = new String(charArray);
        System.out.println(res);
    }
}
