package week5.Workshop;
import java.util.Scanner;


/**
 * Write a description of class Question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question5
{
   public static void main (String[]arg)
   {
       Scanner inp = new Scanner (System.in);
       System.out.println("Enter the number you want to check");
       int num = inp.nextInt();
       int count = 0;
       if (num >= 2)
       {
           for ( int i =2; i<=Math.sqrt(num);i++)
           {
               if (num%i == 0)
               {
                   count++;
               }
           }
       }
       if (count <= 2)
       {
           System.out.println("Prime");
       }
       else
       {
           System.out.println("Composite");
       }
   }
}