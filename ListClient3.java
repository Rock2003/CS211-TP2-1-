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

        List<Integer> otherList = new ArrayList<Integer>();
        otherList.add(100);
        otherList.add(200);
        otherList.add(300);

        List<Integer> arrayList = new ArrayList<Integer>();
        System.out.printf("\n\nTesting ArrayList implementation of AbstractList:\n");
        processList(arrayList, otherList);

        List<Integer> linkedList = new LinkedList<Integer>();
        System.out.printf("Testing LinkedList implementation of AbstractList:\n");
        processList(linkedList, otherList);
    }

    public static void processList(List<Integer> list, List<Integer> other) {
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
       
        System.out.printf("\nList: %s\n", list);
        System.out.printf("size(): %s\n", list.size());
        System.out.printf("contains(30): %s\n", list.contains(30));
        System.out.printf("contains(15): %s\n", list.contains(15));
        System.out.printf("indexOf(40): %s\n", list.indexOf(40));
        System.out.printf("indexOf(60): %s\n", list.indexOf(60));
        System.out.printf("get(1): %s\n", list.get(1));

        list.set(1, 2000);
        System.out.printf("set(1, 2000): %s\n", list);

        list.remove(1);
        System.out.printf("remove(1): %s\n", list);

        list.add(50);
        System.out.printf("add(50): %s\n", list);
        list.add(2,3000);
        System.out.printf("add(2, 3000): %s\n", list);

        System.out.printf("Other List: %s\n", other);
        list.addAll(other);
        System.out.printf("addAll(other): %s\n", list);
        
        list.clear();
        System.out.printf("clear(): %s\n\n\n", list);
    }
}
