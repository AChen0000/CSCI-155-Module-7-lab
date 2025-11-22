import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            // Show an example
            System.out.println("Example: 5,22,70,99,end");
            System.out.println("Enter integers separated by commas (type "end" to finish):");

            String line = input.nextLine();

            // If the user enters "end", exit the program
            if (line.equalsIgnoreCase("end")) {
                System.out.println("Bye!");
                break;
            }

            String[] parts = line.split(",");

            int largest = Integer.MIN_VALUE;

            for (String item : parts) {
                item = item.trim();

                if (item.equalsIgnoreCase("end")) {
                    break;
                }

                int num = Integer.parseInt(item);

                if (num > largest) {
                    largest = num;
                }
            }
            //Show the largest number
            System.out.println("\nThe largest number is: " + largest);
            System.out.println();
        }

        input.close();
    }
}
