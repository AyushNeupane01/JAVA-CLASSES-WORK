package week5.Workshop;


/**
 * Write a description of class SumOfOddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfOddEven
{
  public static void main (String[]arg)
  {
      int e = 0;
      int o = 0;;
      for (int i = 0; i<=10; ++i)
      {
          if (i%2 ==  0)
          {
              e = e+i;
          }
          else
          {
              o = o+i;
          }
      }
      System.out.println("Sum of Even = "+e+"\nSum of Odd= "+o);
  }
}