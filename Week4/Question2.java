package Week4;
import java.util.Scanner;


/**
 * Write a description of class Question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question2
{
  public static void main(String[]arg)
  {
    Scanner Time = new Scanner(System.in);
    System.out.println("Enter The time in Seconds: ");
    int input = Time.nextInt();
    int hour = (input/3600); 
    int minute = (input -(3600*hour))/60;
    int second = (input -(3600*hour)-(minute*60));
    System.out.println(input+"sec is "+hour+"hrs "+minute+"mins "+second+"secs");
  }
  
  
}