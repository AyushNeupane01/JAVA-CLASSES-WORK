package week4actual.Workshop;
import java.util.Scanner;


/**
 * Write a description of class Grading here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grading
{
   public static void main (String[]arg)
   {
       Scanner input = new Scanner (System.in);
       System.out.println("Enter The GPA");
       float gpa = input.nextFloat();
       if (gpa <= 4.0 && gpa > 1.00)
       {
           if (gpa <= 4.0 && gpa > 3.6)
           {
               System.out.println("The grade is A+");
           }
           else if (gpa <= 3.6 && gpa >= 3.25)
           {
               System.out.println("The grade is A");
           }
           else if (gpa <= 3.24 && gpa >= 3.0)
           {
               System.out.println("The grade is B+");
           }
           else if (gpa <= 2.99 && gpa >= 2.0)
           {
               System.out.println("The grade is B");
           }
           else if (gpa <= 1.99 && gpa >= 1.0)
           {
               System.out.println("The grade is C+");
           }
           else if (gpa <= 0.99 && gpa > 0.0)
           {
               System.out.println("The grade is D");
           }
           else
           {
               System.out.println("Failed");
           }
       }
       else
       {
           System.out.println("Invalid GPA");
       }
   }
}