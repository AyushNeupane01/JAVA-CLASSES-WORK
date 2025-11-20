package week3;

/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String[]arg)
    {
        // System.out.println("This program is for Types of Data Type");
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.BYTES);
        // System.out.println(Integer.SIZE);
        System.out.println((Float.MAX_VALUE)+"\n"+(Float.MIN_VALUE)+"\n"+(Float.BYTES)+"\n"+(Float.SIZE));
        
        int a=20;
        float g=2.33f;
        double h=2.334;
        
        int x=(int)(a+g+h);
        System.out.println(x);
        
        char c = 'A';
        System.out.println((int)c);
        
        int d = 50;
        System.out.println((char)d);
        
        int l=10;
        int b = 20;
        
        int area = l*b;
        int perimeter = (2*(l+b));
        System.out.println("Area ="+area+"\nPerimeter ="+perimeter);
        
        int principle = 500;
        int time = 2;
        float rate=2.4f;
        
        float SI = (principle*time*rate)/100f;
        double CI = principle*Math.pow(1+rate, time);
        System.out.println(SI +"\n"+ CI); 
    }
}