package Week4;
import java.util.Scanner;


/**
 * Write a description of class Workshop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations3
{
    public static void main(String[]arg)
    {
         Scanner Oper = new Scanner(System.in);
         System.out.println("Enter your desired number: ");
         int value = Oper.nextInt();
         String pass = "Passed";
         String fail = "Failed";
         String out = (value>40)?pass:fail;
         System.out.println(out);
    }
}