package week4actual.Workshop;
import java.util.Scanner;


/**
 * Write a description of class PassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassFail
{
  public static void main(String[]arg)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the marks your received:");
    double marks = input.nextDouble();
    if (marks >=40)
    {
        System.out.println("You passed");
    }
    else if (marks > 100 || marks < 1)
    {
        System.out.println("Enter Correct Marks");
    }
    else
    {
        System.out.println("You failed");
    }
  }
  
}