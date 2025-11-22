import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class SortStudents {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        //Ask 
        System.out.println("Enter student names and scores. Type 'end' to finish.");

        while (true) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("end")) {
                break; // exit loop
            }

            System.out.print("Enter student score: ");
            int score = Integer.parseInt(scanner.nextLine());

            students.add(new Student(name, score));
        }

        // Sort students by score 
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.score - s1.score; // descending order
            }
        });

        System.out.println("\nStudents sorted by score (highest to lowest):");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.score);
        }
    }
}
