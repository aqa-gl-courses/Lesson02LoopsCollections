package com.aqacourses.test;

import java.util.*;

public class LoopsCollections {

    public static void main(String[] args) {

        // Creating new ArrayList with user defined data types
        ArrayList<NewDataType> newDataTypeArrayList = new ArrayList<>();

        // Creating new ArrayList
        List<String> list = new ArrayList<>();
        list.add("First in ArrayList");
        list.add("Second in ArrayList");
        list.add("Third in ArrayList");

        // Print all values with for loop (short variant 'fori')
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Print all values with foreach loop (short variant 'iter')
        for (String s : list) {
            System.out.println(s);
        }

        // Using while and iterator
        Iterator iterator = list.iterator();

        // Print all values with iterator (short variant 'itit')
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Do-while loop
        do {
            System.out.println("DO!");
        } while (false);


        // HashMap using with foreach loop
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "First in HashMap");
        map.put(2, "Second in HashMap");
        map.put(3, "Third in HashMap");

        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println("This is a key - " + integerStringEntry.getKey()
                    + " and this is a value - " + integerStringEntry.getValue());
        }

        // Some variables for HashSet
        String first = "First in HashSet";
        String second = "Second in HashSet";
        String third = "Third in HashSet";

        // HashSet with iterator
        Set<String> set = new HashSet<>();
        set.add(first);
        set.add(second);
        set.add(third);

        Iterator newIterator = set.iterator();

        // Remove elements from HashSet
        while (newIterator.hasNext()) {
            System.out.println("Removed - " + newIterator.next());
            newIterator.remove();
        }

        // Two dimensional ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("First in two dimensional ArrayList");
        stringList.add("Second in two dimensional ArrayList");
        stringList.add("Third in two dimensional ArrayList");

        // Array list with data types ArrayList
        ArrayList<ArrayList> twoList = new ArrayList<>();
        twoList.add(stringList);

        // Loop that iterate twoList ArrayList
        for (int i = 0; i < twoList.size(); i++) {
            // Loop that iterate stringList
            for (int j = 0; j < twoList.get(i).size(); j++) {
                System.out.println(twoList.get(i).get(j));
            }
        }

    }

}
