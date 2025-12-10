package week5.Workshop;


/**
 * Write a description of class Question1DoWhile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question1DoWhile
{
   public static void main (String[]arg)
   {
       int i = 0;
       do
       {
           i++;
           int x = i*i;
           System.out.println("Square of "+i+" Using DO While: "+x);
       }while (i<=9);
   }
}