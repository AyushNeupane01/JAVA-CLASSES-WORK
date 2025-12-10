package week4actual.Workshop;
import java.util.Scanner;


/**
 * Write a description of class Discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Discount
{
    public static void main (String[]arg)
  {
      Scanner input = new Scanner (System.in);
      System.out.println("Enter the Marked Price:");
      float mp = input.nextFloat();
      System.out.println("Enter the Discount Category:\n.A\n.B\n.C\n.D");
      char Cate = input.next().charAt(0);
      switch (Cate)
      {
        case ('A'):  
        float spA = mp-(mp*60/10);
        System.out.println("After Discount the SP of the product is: "+spA);
        break;
        
        case ('B'):  
        float spB = mp-(mp*40/100);
        System.out.println("After Discount the SP of the product is: "+spB);
        break;
        
        case ('C'):  
        float spC = mp-(mp*20/100);
        System.out.println("After Discount the SP of the product is: "+spC);
        break;
        
        case ('D'):  
        float spD = mp-(mp*10/100);
        System.out.println("After Discount the SP of the product is: "+spD);
        break;
        
        default:
        System.out.println("Wrong Category");
        break;
      }
  }
}