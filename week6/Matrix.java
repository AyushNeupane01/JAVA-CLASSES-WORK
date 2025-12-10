package week6;
import java.util.Scanner;


/**
 * Write a description of class Matrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                m[i][j] = sc.nextInt();
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
