package week4actual.Workshop;
import java.util.Scanner;


/**
 * Write a description of class EvenOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOdd
{
   public static void main (String[]arg)
   {
       Scanner input = new Scanner (System.in);
       System.out.println("Enter the number:");
       int number = input.nextInt();
       if (number % 2 == 0)
       {
           System.out.println("Even");
       }
       else
       {
           System.out.println("Odd");
       }
   }
}