import java.util.ArrayList;
import java.util.Arrays;

public class StringArray {


    public static void main(String[] args) {

        int s;

        //String [] myArray = new String[4];//I have to give a size 0 1 2 3
        String [] myArray = {"ggdfdvd", "jjnc", "cxjvb", "dcfd"};


        ArrayList <String> myArrayList  = new ArrayList<>(); // we do not have a size,

        ArrayList <String> names1 = new ArrayList <>(Arrays.asList("Ulan", "Ali", "fdvf", "chbhcvzxhvczh", "hjcjzhxbczhcv"));


        // Declaring an ArrayList of Strings
        ArrayList <String>  names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("John");// index 0
        names.add("Jane");// 1
        names.add("Jim"); //2
        names.add("Jerry");
        names.add(2, "Jack");//4




        // Printing the ArrayList
        System.out.println("Original ArrayList: " + names);

        // Removing an element from the ArrayList
       // names.remove("Jim");




        // Printing the modified ArrayList
        System.out.println("Modified ArrayList: " + names);

        // Accessing an element using the get() method
        System.out.println("Element at index 2: " + names.get(2));

        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + names.isEmpty());

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + names.size());



    }
}
