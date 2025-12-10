package week5;


/**
 * Write a description of class ForLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoop
{
    public static void main(String[]arg)
    {
        int sum = 0;
        for (int i = 1; i<=10; i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}