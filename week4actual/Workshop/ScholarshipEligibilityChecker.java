package week4actual.Workshop;


/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ScholarshipEligibilityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();
        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();
        System.out.print("Enter attitude score (1-10): ");
        int attitudeScore = input.nextInt();
       
        if (gpa >= 3.2) {
            if (attendance > 80) {
                if (attitudeScore < 5) {
                    System.out.println("The student is NOT eligible for a scholarship.");
                } else {
                    System.out.println("The student is eligible for a scholarship.");
                }
            } else {
                System.out.println("The student is NOT eligible for a scholarship due to attendance.");
            }
        } else {
            System.out.println("The student is NOT eligible for a scholarship due to GPA.");
        }

    }
}