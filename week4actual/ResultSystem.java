package week4actual;
import java.util.Scanner;


/**
 * Write a description of class ResultSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResultSystem
{
   public static void main(String[]arg)
   {
     Scanner Marks = new Scanner(System.in);
     System.out.println("**************Welcome to Pass/Fail System**************\n");
     System.out.println("Enter the Percentage you got: ");
     int percent = Marks.nextInt();
     if (percent<=100 && percent >=95)
     {
      System.out.println("Distinction Result!!!");    
     }
     else if (percent<=94 && percent >=80)
     {
      System.out.println ("First Division!!");   
     }
     else if (percent <=79 && percent >=70)
     {
      System.out.println("Second Division!");    
     }
     else if (percent <= 69 && percent >=50)
     {
         System.out.println("Third Division");
     }
     else if (percent >100)
     {
      System.out.println(".............Invalid Percentage............");   
     }
     else
     {
      System.out.println("Failed!!! \nHAHAHA");    
     }
   }
}