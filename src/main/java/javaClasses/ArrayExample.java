package javaClasses;

public class ArrayExample {
    public static void main(String[] args) {
        //First declare an array numbers of integers, with a size of 5.
        // Declaring an array of integers

        int [] numbers = new int[3];

        // Initializing the array elements   // Then, we initialize the elements of the array with some values.
        numbers[0] = 10; //
        numbers[1] = 20;
        numbers[2] = 30;



        // Accessing the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }


        String[] words = new String[3];

        // Initializing the array elements
        words[0] = "Hello";
        words[1] = "World";
        words[2] = "!";

        // Accessing the elements of the array
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}






