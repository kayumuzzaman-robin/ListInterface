package learn.java;

import java.util.*;

/**
 * ArrayList
 */
public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);

//      Initialize an array to make it list
        String[] stringsArray = {"A", "B", "C", "X", "D", "Y", "Z", "E", "AE"};
//      Array to list
        List<String> stringArrayList = new ArrayList<>(Arrays.asList(stringsArray));
        System.out.println("stringArrayList: " + stringArrayList);

        stringArrayList.add("W");
        System.out.println("After adding \"W\" stringArrayList: "+ stringArrayList);

        stringArrayList.remove("D");
        System.out.println("After removing object \"D\" stringArrayList: " + stringArrayList);

        stringArrayList.remove(stringArrayList.size() - 1);
        System.out.println("After removing last index size() - 1 , stringArrayList: " + stringArrayList);

//      Lambda expression remove, will remove all that contains E in string
        stringArrayList.removeIf(s -> s.contains("E"));
        System.out.println("After removing String that contains E, stringArrayList: " + stringArrayList);

//      Using foreach loop to iterate
        for (String element : stringArrayList) {
            System.out.println(element);
        }

//      Using Iterator interface
        Iterator<String> stringIterator = stringArrayList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println("iterator value: " + stringIterator.next());
        }

//      Sorting the list in reverse order
        stringArrayList.sort(Collections.reverseOrder());

//      Using .forEach method with method reference for list showing
        stringArrayList.forEach(System.out::println);


    }
}
