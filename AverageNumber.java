import java.util.Scanner;

public class AverageNumber {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            // Show example
            System.out.println("Example: 5,10,2,8,15");
            System.out.println("Enter integers separated by commas (type "end" to finish):");

            String line = input.nextLine();

            // If user enters only "end", end the program
            if (line.equalsIgnoreCase("end")) {
                System.out.println("Bye!");
                break;
            }

            String[] parts = line.split(",");

            int sum = 0;
            int count = 0;

            // Calculate sum + count
            for (String item : parts) {
                item = item.trim();

                if (item.equalsIgnoreCase("end")) {
                    break;
                }

                int num = Integer.parseInt(item);
                sum += num;
                count++;
            }

            // Compute average
            double average = (double) sum / count;

            // Count numbers above average
            int aboveCount = 0;
            for (String item : parts) {
                item = item.trim();

                if (item.equalsIgnoreCase("end")) {
                    break;
                }

                int num = Integer.parseInt(item);

                if (num > average) {
                    aboveCount++;
                }
            }

            // Show results
            System.out.println("\nAverage: " + average);
            System.out.println("Numbers above average: " + aboveCount);
            System.out.println();
        }
        //Finish
        input.close();
    }
}
