package AccenturePractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class firstLetterOccurTwice {

    public static char repeater(String s) {
        Set<Character> seen = new HashSet<>();

        for(int i=0; i<s.length(); i++) {

            char currChar = s.charAt(i);

            if(seen.contains(currChar)) {
                return currChar;
            }

            seen.add(currChar);
        }

        return 0;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();
        System.out.println(repeater(str));
    }
}
