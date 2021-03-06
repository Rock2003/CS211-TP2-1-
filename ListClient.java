/*
* Group: Project Team #5
* Course: CS211 (C) Spring 2020
* Date: May 19, 2020
* Assignment: Ch16 Programming Project #3
* This class is the client class for testing purposes of the abstractlist 
* superclass in the form of a linkedlist and arraylist 
* The results that are required for a pass of the test 
* are commented as // expected: {value} 
*/
//compiler directive to eliminate superfluous warnings.
@SuppressWarnings("unchecked")
public class ListClient {
	public static void main(String[] args) {
		// tests the arraylist as an instance of an abstractlist
		 AbstractList<Integer> arraylist = new ArrayList<Integer>();
		 System.out.println("\t\tTesting ArrayList\n------------------------------------------------------");
	     processList(arraylist);
	     System.out.println("\n");
	   // tests the linkedlist as an instance of abstractlist  
	      AbstractList<Integer> linkedlist = new LinkedList<Integer>();
	      System.out.println("\t\tTesting LinkedList\n------------------------------------------------------");
	      processList(linkedlist);
	}
	
	public static void processList(AbstractList<Integer> list) {
		/*
		 * NOTE: The toString method is not tested as it is implicitly called in each of
		 * the println statements 
		 */
		System.out.println("Methods implemented seperately in each respective list");
		list.add(7);
		list.add(-988);
		list.add(38);
		list.add(42);
		System.out.println("List: " + list);
		// expected: 4
		System.out.println("Size: " + list.size());
		list.add(0,97);
		// expected: [97, 7, -988, 38, 42]
		System.out.println("After list.add(0,97): " + list);
		list.clear();
		// expected: []
		System.out.println("After list.clear(): " + list);
		System.out.println("------------------------------------------------------");
	
		System.out.println("Methods inherited from AbstractList<E> superclass");
		list.add(68);
		// expected: [68]
		System.out.println("After list.add(68): " + list);
		AbstractList<Integer> addAllTest = new LinkedList<Integer>();
		addAllTest.add(4);
		addAllTest.add(-577);
		addAllTest.add(92);
		addAllTest.add(2);
		list.addAll(addAllTest);
		// expected: [68, 4, -577, 92, 2]
		System.out.println("List after adding: " + addAllTest +  ": " + list);
		// expected: false
		System.out.println("Checking list.isEmpty(): " + list.isEmpty());
		// expected: 4
		System.out.println("Finding list.indexOf(2): " + list.indexOf(2));
		// expected: false
		System.out.println("Checking list.contains(357): " + list.contains(357));
		System.out.println("------------------------------------------------------");
		
	}
	
}