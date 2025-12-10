package week4actual.Workshop;
import java.util.Scanner;


/**
 * Write a description of class DiscountIF here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiscountIF
{
     public static void main (String[]arg)
   {
      Scanner input = new Scanner (System.in);
      System.out.println("Enter the Marked Price:");
      float mp = input.nextFloat();
      System.out.println("Enter the Discount category:\n.A\n.B\n.C\n.D");
      char cate = Character.toUpperCase(input.next().charAt(0));//char cate = Character.toUpperCase(input.next().charAt(0));

      if (cate == 'A')
      {
        float spA = mp-(mp*60/100);
        System.out.println("After Discount the SP of the product is: "+spA);
      }
      else if (cate == 'B')
      {
          float spB = mp-(mp*40/100);
        System.out.println("After Discount the SP of the product is: "+spB);
      }
      else if (cate == 'c')
      {
          float spC = mp-(mp*60/100);
        System.out.println("After Discount the SP of the product is: "+spC);
      }
      else if (cate == 'D')
      {
          float spD = mp-(mp*60/100);
        System.out.println("After Discount the SP of the product is: "+spD);
      }
      else
      {
          System.out.println("******Execution Error******");
      }
      }

}
