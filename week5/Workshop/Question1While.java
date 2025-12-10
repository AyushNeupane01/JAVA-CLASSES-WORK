package week5.Workshop;


/**
 * Write a description of class Question1While here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question1While
{
   public static void main (String []arg)
   {
       int i = 0; 
       while (i<=9)
       {
           i++;
           int x = i*i;
           System.out.println("Squares of "+i+" Using WHile: "+x);
       }
   }
}