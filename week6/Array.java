package week6;


/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
   public static void main (String[]arg)
   {
       int [] age; //array decleration
       age = new int[5]; //construction of array
       
       age[0] = 10; //initialization
       age[1] = 20;
       age[2] = 30;
       age[3] = 40;
       age[4] = 50;
       
       for (int i=0; i<=4; i++)
       {
           System.out.println(age[i]);
       }
   }
}