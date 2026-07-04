import java.util.Scanner;
public class q9array {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
                System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }

            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);

        sc.close();
    }
}
    
