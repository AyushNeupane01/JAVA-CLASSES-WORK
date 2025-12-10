package week4actual.Workshop;
import java.util.Scanner;


/**
 * Write a description of class Question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question3
{
   public static void main (String[]arg)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number you want to check:");
       int number = input.nextInt();
       if (number > 1)
       {
           System.out.println("+ve");
       }
       else if (number < 1)
       {
           System.out.println("-ve");
       }
       else
       {
           System.out.println("Zero");
       }
   }
}