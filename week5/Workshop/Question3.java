package week5.Workshop;
import java.util.Scanner;


/**
 * Write a description of class Question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question3
{
    public static void main (String []arg)
    {
        Scanner inp = new Scanner (System.in);
        System.out.println("Enter the desired number:");
        int num = inp.nextInt();
        int rem = 0;
        int rev = 0;
        int chk = num;
        while (num!=0)
        {
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println("The reversed number: "+rev);
        if (chk == rev)
        {
            System.out.println("Number "+chk+" is palindrome");
        }
        else
        {
            System.out.println("Number "+chk+" is Not palindrome");
        }
    }
}