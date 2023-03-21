package SC025_Assg;

import java.util.Scanner;

import javax.management.ValueExp;

/**
 * SC025_Assg
 */
public class SC025_Assg {

    public static void main(String[] args) {
        double[] values = new double[10]; // intialize the array values
        Scanner sc = new Scanner(System.in); // declaration for the Scanner identifier
        System.out.println("Programme Start"); // user friendly message
        for (int i = 0; i < values.length; i++) {
            System.out.print("Please insert value " + (i + 1) + " : "); // ask user to insert the value 10 times
            values[i] = sc.nextDouble(); // prompt the value inserted by user
        }
        System.out.println("\nInsert Section End!"); // tell user that the section is end
        System.out.print("Please insert a number you want to search: "); // ask user to insert the value they want to
                                                                         // search
        double search = sc.nextDouble(); // prompt the value insert by user
        int[] indexs = new int[0]; // create a indexs array in order to track the index for the element which value
                                   // wanted by user
        for (int i = 0; i < values.length; i++) {
            if (search == values[i]) { // if the value is wanted by user
                int[] new_indexs = new int[indexs.length + 1]; // create a buffer for the array indexs but add 1 size
                                                               // for it to add the new index
                for (int j = 0; j < indexs.length; j++) {
                    new_indexs[j] = indexs[j]; // copy all the value from the array indexs

                }
                new_indexs[new_indexs.length - 1] = i;  //inset the new index that found in the last element
                indexs = new_indexs;    //update the array indexs
            }
        }
        if (indexs.length > 0) {    //if the value found
            System.out.println("This is the indexs of a array that I found base on your input:");   //tell user that we found
            for (int i = 0; i < indexs.length; i++) {
                System.out.print(indexs[i] + " ");  //list all the indexs
            }
        } else {
            System.out.print("Not Found");  //tell the user that no value has found
        }
    }
}