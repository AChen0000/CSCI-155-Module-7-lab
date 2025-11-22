import java.util.Random;
import java.util.Scanner;

public class CountVowel {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Type anything to generate letters, or type 'end' to stop:");
            String line = input.nextLine();

            if (line.equalsIgnoreCase("end")) {
                //End program with Bye
                System.out.println("Bye!");
                break;
            }

            char[] letters = new char[100];
            int vowelCount = 0;

            System.out.println("\nGenerated letters (vowels marked with *):");

            for (int i = 0; i < letters.length; i++) {
                letters[i] = (char) ('a' + rand.nextInt(26));
                //Check vowel
                boolean isVowel = letters[i] == 'a' || letters[i] == 'e' ||
                                  letters[i] == 'i' || letters[i] == 'o' ||
                                  letters[i] == 'u';

                if (isVowel) {
                    vowelCount++;
                    System.out.print(letters[i] + "* "); // mark vowels
                } else {
                    System.out.print(letters[i] + " ");
                }

                // Print 10 letters per line
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }

            System.out.println("\nTotal vowels in this set: " + vowelCount + "\n");
        }
        //Finish
        input.close();
    }
}
