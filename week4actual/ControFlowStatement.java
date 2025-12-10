package week4actual;
import java.util.Set;
import java.util.Scanner;


/**
 * Write a description of class ControFlowStatement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ControFlowStatement
{
   public static void main (String[]arg)
   {
       // This program is for Even ODD statement
       Scanner condtn = new Scanner(System.in);
       System.out.println("Enter the desired number: ");
       int num = condtn.nextInt();
       if (num%2 == 0)
       {
        System.out.println("The number "+num+" is Even");
       }
       else
       {
        System.out.println("The number "+num+" is Odd");   
       }
   }
}