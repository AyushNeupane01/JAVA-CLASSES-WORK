package week5.Workshop;
import java.util.Scanner;


/**
 * Write a description of class Question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question4
{
    public static void main(String[]arg)
    {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = inp.nextInt();
    int rem = 0;
    int e =0;
    int o=0;
    while (num!=0)
    {
        rem = num%10;
        num = num/10;
        if (rem%2 ==0)
        {
            e++;
        }
        else
        {
            o++;
        }
    }
    System.out.println("The total number of Even digits: "+e);
    System.out.println("The total number of Odd digits: "+o);
    }
}