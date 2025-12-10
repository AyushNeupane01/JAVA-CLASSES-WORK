package week5;
import java.util.Scanner;


/**
 * Write a description of class Resturant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Resturant
{
  public static void main(String[]arg)
  {
      Scanner input = new Scanner(System.in);
      int choice;
      int quantity;
      int totalBill=0;
      char dec;
      System.out.println("****************Welcome To The Dum Restro Menu****************");
      System.out.println("                 Please Select the Item to Eat                ");
      do
      {
          System.out.println("1. Burger - Rs 200");
          System.out.println("2. Momo - Rs 150");
          System.out.println("3. Pizza - Rs 600");
          System.out.println("0. Bill");
          choice = input.nextInt();
          if (choice == 1)
          {
              
                  System.out.println("How many Burgers Do you want??:");
                  quantity = input.nextInt();
                  totalBill+=200*quantity;
          }
                  
          else if (choice == 2)
          {
                  System.out.println("How many plates of Momo Do you want??:");
                  quantity = input.nextInt();
                  totalBill+=150*quantity;
          }        
                  
          else if (choice == 3)
          {
                  System.out.println("How many Pizzas Do you want??:");
                  quantity = input.nextInt();
                  dec = input.next().charAt(1);
                  totalBill+=600*quantity;
          }
                  
          else if (choice == 0)
         {
                  System.out.println("Your Bill is Being Calculated:");
                  System.out.println("The Total amount is: "+totalBill);
         }
                  
              else
         {
                  System.out.println("Wrong Choice");
         }
      }while(choice!=0);
      System.out.println("****************ThankYou****************");
  }
}