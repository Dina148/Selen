package javaClasses;
import java.util.Scanner;
public class LessonScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Object
        double d1 = input.nextDouble();
        char operation = input.next().charAt(0);
        double d2 = input.nextDouble();

        if (operation == '+')

            System.out.println( d1 + d2 );


       else if (operation == '-')
            System.out.println( (int) (d1 - d2) );//parsing


        else if (operation == '*')
            System.out.println( (int)(d1 * d2));


        else if (operation == '/')
            System.out.println((int) (d1 / d2));


        else
            System.out.println("invalid number");   //--->  a, c, d






    }
}