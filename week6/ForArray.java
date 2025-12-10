package week6;


/**
 * Write a description of class ForArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForArray
{
   public static void main (String[]arg)
   {
       int [] number = new int[5];
       int x =2;
       for (int i =0; i<number.length;i++)
       {
           number[i]=x;
           x=x+2;
       }
       for (int i = 0; i<number.length;i++)
       {
           System.out.println(number[i]);
       }
   }
}