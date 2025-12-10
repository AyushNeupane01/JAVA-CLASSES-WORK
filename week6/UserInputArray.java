package week6;
import java.util.Scanner;


/**
 * Write a description of class UserInputArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputArray
{
   public static void main(String[]arg)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number of data you want to save");;
       int n = input.nextInt();
       input.nextLine();
       String [] name = new String[n];
       for (int i =0; i<name.length; i++)
       {
           System.out.println("Enter the name of student no. "+(i+1)+":");
           name[i] = input.nextLine();
       }
       System.out.println("Names of Students:\n");
       for (int j =0; j<name.length; j++)
       {
           System.out.println((j+1)+". "+name[j]+"\n");
       }
       
   }
}