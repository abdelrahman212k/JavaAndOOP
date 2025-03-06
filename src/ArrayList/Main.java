package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // defining an ArrayList with a primitive data type
        ArrayList<Integer> intList = new ArrayList();
        ArrayList<Float> floatList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<Double>();

        /*Adding elements to ArrayList*/
        //Converting these number into a list using Arrays.asList() and assigning them to intList using addAll()
        intList.addAll(Arrays.asList(10, 20, 30));

        //Adding number to ArrayList starting from index
        intList.addAll(3, Arrays.asList(40, 50));

        System.out.println(intList);

        //Copying elements from intList to floatList using clone() which return an object of the ArrayList
        //But, we cast it to assign it to floatList without any errors
        //This is called shallow copy (copy by value) which is different than reference copy done using '=' operator
        floatList = (ArrayList)intList.clone();

        /*Editing value of element in ArrayList*/
        intList.set(2,95);
        System.out.println(intList);

        /*Removing element from ArrayList: 5 methods to use*/
        //Removing by index
        intList.remove(2); //Remove element with index = 2

        //Remove by value
        //remove method takes an object and will through an error if you send a number directly without casting
        //So, use valueOf() which return an Integer object to cast the value you want to delete
        intList.remove(valueOf(10));
        System.out.println(intList);

    }
}
