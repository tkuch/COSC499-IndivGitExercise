/* 
* COSC 499 - Individual Git Exercise
* Created by Tasha Kucher 
* A simple sortable program that sorts either a list of integers or strings.
* Note: Developed locally on personal machine.
*/

package src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sortable
{
    private static List<String> stringList = new ArrayList<>();
    private static List<Integer> intList = new ArrayList<>();

    public static void main(String[] args)
    {
        String spacer = "------------------------------------------------------------------"; // for console display purposes
        System.out.println(spacer);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose between a String and an Integer array list. [STRING/INTEGER]: ");
        var choice = sc.nextLine().toUpperCase(); // set user input to uppercase for check
        System.out.println(spacer);

        if (isStringChoice(choice)) { // if the user selected the "STRING" list option
            for (int i = 0; i < 5; i++) { // take user input for 5 strings
                System.out.printf("Please enter a word (%s/5): ", i+1);
                addString(sc.nextLine());
            }
            System.out.println(spacer);
            System.out.printf("Inputted list : %s%n", stringList); //display list before sort
            Collections.sort(stringList); // sort list
            System.out.printf("Sorted list   : %s%n", stringList); //display list after sort
        }
        else if (isIntegerChoice(choice)) { // if the user selected the "INTEGER" list option
            for (int i = 0; i < 5; i++) { // take user input for 5 ints
                System.out.printf("Please enter a number (%s/5): ", i+1);
                addInteger(sc.nextInt());
            }
            System.out.println(spacer);
            System.out.printf("Inputted list : %s%n", intList); //display list before sort
            Collections.sort(intList); // sort list
            System.out.printf("Sorted list   : %s%n", intList); //display list after sort
        }
        else { //otherwise print msg and end program
            System.out.println("Invalid option. Please try again.");
        }
        System.out.println(spacer);
        sc.close(); //close scanner
    }
    
    public static void addString(String input) {
        stringList.add(input);
    }

    public static void addInteger(Integer number) {
        intList.add(number);
    }

    public static boolean isStringChoice(String userInput) {
        if (userInput.equals("STRING")) { return true; }
        return false;
    }

    public static boolean isIntegerChoice(String userInput) {
        if (userInput.equals("INTEGER")) { return true; }
        return false;
    }

    public static int sizeOfStringList() {
        return stringList.size();
    }

    public static int sizeOfIntList() {
        return intList.size();
    }
}