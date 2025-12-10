package Week4;
import java.util.Scanner;


/**
 * Write a description of class Days here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Days
{
  public static void main (String[]arg)
  {
    Scanner days = new Scanner(System.in);
    System.out.println("Enter the number of days");
    int ndays = days.nextInt();
    int year = ndays/365;
    int months = (ndays - (year*365))/30;
    int day = (ndays -(year*365)-(months*30));
    System.out.println(year+"years "+months+"mnths "+day+"days ");
  }
}