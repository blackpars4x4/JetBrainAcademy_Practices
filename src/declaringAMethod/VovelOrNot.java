package declaringAMethod;

import java.util.Scanner;

public class VovelOrNot {

    public static boolean isVowel(char ch) {
        // write your code here

        char upperCase = Character.toUpperCase(ch);
        return upperCase == 'A' || upperCase == 'E' || upperCase == 'I' || upperCase == 'O' || upperCase == 'U';
        /*return "AEIOUaeiou".indexOf(ch) != -1;*/
        /*return Set.of('a', 'e', 'i', 'o', 'u').contains(Character.toLowerCase(ch));*/
        /*return "aeiou".contains(String.valueOf(ch).toLowerCase());*/

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
