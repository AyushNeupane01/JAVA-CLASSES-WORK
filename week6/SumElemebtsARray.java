package week6;


/**
 * Write a description of class SumElemebtsARray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumElemebtsARray
{
  public static void main (String[]bomb)
  {
      int []arr={10,20,44,55,22};
      int sum = 0;
      
      for (int i = 0; i<arr.length;i++)
      {
          sum = sum+arr[i];
      }
      System.out.println(sum);
  }
}