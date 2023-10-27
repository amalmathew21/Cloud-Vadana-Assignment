import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();

        boolean[] alphabetCheck = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetCheck[ch - 'a'] = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                alphabetCheck[ch - 'A'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean value : alphabetCheck) {
            if (!value) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input is a Pangram.");
        } else {
            System.out.println("The input is not a Pangram.");
        }
    }
}
