import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = in.nextInt();

        // Input grades from the teacher or user
        for (int i = 0; i < numberOfStudents; i++) 
        {
            System.out.print("\nEnter grade for student " + (i + 1) + ": ");
            int grade = in.nextInt();
            if (grade >= 0 && grade <=100)
            	grades.add(grade);
            else
            {
            	System.out.println("Marks entered is invalid.");
            	System.out.println("Results till the correct marks entered.");
            	break;
            }
        }

        // Compute average, highest, and lowest scores
        double average = calculateAverage(grades);
        int highestScore = findHighestScore(grades);
        int lowestScore = findLowestScore(grades);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);

    }

    // Method to calculate average score
    private static double calculateAverage(ArrayList<Integer> grades)
    {
        int sum = 0;
        for (int grade : grades) 
        {
            sum += grade;
        }
        return ((double) sum / grades.size());
    }

    // Method to find the highest score
    private static int findHighestScore(ArrayList<Integer> grades)
    {
        return (Collections.max(grades));
    }

    // Method to find the lowest score
    private static int findLowestScore(ArrayList<Integer> grades)
    {
        return (Collections.min(grades));
    }
}
