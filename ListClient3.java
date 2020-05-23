/*
 * Group: Project Team #5
 * Course: CS211 (C) Spring 2020
 * Date: May 19, 2020
 * Assignment: Ch16 Programming Project #3
 *  
 */

//This is a test client to ensure that all methods and behavior of the List Abstract Data Type
//have been correctly implemented.

//compiler directive to eliminate superfluous warnings.
@SuppressWarnings("unchecked")

public class ListClient3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        processList(list1);
        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        processList(list2);
    }

    public static void processList(List list, List other) {
        list.add(42);
        list.add(18);
        list.add(27);
        list.add(93);
        System.out.println(list);
        System.out.println("list.size() " + list.size());
        System.out.println("list.contains(18) " + list.contains(18));
        System.out.println("list.indexOf(18) " + list.indexOf(18));
        list.add(10);
        System.out.println("list.add(10)" + list);
        list.add(2,4);
        System.out.println("list.add(2, 4)" + list);
        //the below method requires an additional list to be passed into the method
        list.addAll(other);
        System.out.println("list.addAll(list3)" + list);
        list.clear();
        System.out.println("list.clear()" + list);
    }
}
