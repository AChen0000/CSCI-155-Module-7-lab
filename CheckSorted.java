import java.util.Scanner;

public class CheckSorted {
public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false; // To find a pair that is out of order
            }
        }
        return true; // All elements are in increasing order
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Ask for list
            System.out.print("Enter list (or type 'end' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                System.out.println("Bye!");
                break; // exit loop
            }

            String[] numbers = input.split(" ");

            // First number is the count, not part of the list
            int n = Integer.parseInt(numbers[0]);
            int[] list = new int[n];

            for (int i = 0; i < n; i++) {
                list[i] = Integer.parseInt(numbers[i + 1]);
            }

            // Check if the list is sorted
            if (isSorted(list)) {
                System.out.println("The list is already sorted\n");
            } else {
                System.out.println("The list is not sorted\n");
            }
        }
    }
}
