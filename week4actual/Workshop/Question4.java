package week4actual.Workshop;
import java.util.Scanner;


/**
 * Write a description of class Question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question4
{
   public static void main(String[]arg)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number you want to check");
       int num = input.nextInt();
       if (num % 3 == 0 && num % 5 == 0)
       {
           System.out.println("Divisible by 3 and 5");
       }
       else if (num % 3 == 0 && num % 5 != 0)
       {
           System.out.println("Divisible by 3 but not by 5");
       }
       else if (num % 3 != 0 && num % 5 == 0)
       {
           System.out.println("Divisible by 5 but not by 3");
       }
       else
       {
           System.out.println("Not divisible by both");
       }
   }
}