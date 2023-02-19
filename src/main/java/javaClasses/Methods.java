package javaClasses;

public class Methods {

   public static void sayHelloToStudents() {

       System.out.println("Say hello to Anvar and Givork!!!!");
   }






    public static int minNumber(int n1, int n2) {
        int min;
        if (n1 > n2) // 3 5
            min = n2;
        else
            min = n1;
        return min;
    }

    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }


    public static void main(String[] args) {

         sayHelloToStudents();

        int a = 17;
        int b = 20;

        int result = minNumber(a, b);

        System.out.println("Minimum Value = " + result);

    }




}
