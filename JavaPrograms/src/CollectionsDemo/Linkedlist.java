package CollectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		// add linkedlist

		ll.add("TEST");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("JABRA");
		
		
		// print
		System.out.println("List of linkedlist" + ll);

		// addfirst
		ll.addFirst("Aniket");

		// addlast
		ll.addLast("Automation");

		// print
		System.out.println("List of linkedlist" + ll);

		//get 
		
		System.out.println(ll.get(0));
		
		//set
		ll.set(1, "Tron");
		System.out.println(ll.get(1));
		
		//remove first and last element
		
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of the element" + ll);
		
		ll.remove(2);
		System.out.println("Content of the element" + ll);
		
		//How to print all the values of the linked list
		//for loop
		System.out.println("******  Using for loop *****");
		for(int n = 0 ;n<ll.size(); n++)
		{
			System.out.println(ll.get(n));
		}
		
		//advance for loop
		System.out.println("******  Using advance for loop *****");
		
		for(String str : ll)
		{
			System.out.println(str);
		}
		
		//iterator
		System.out.println("******  Using iterator *****");
		
		Iterator<String> I1 = ll.iterator();
		while (I1.hasNext()) {
			String str = (String) I1.next();
			System.out.println(str);
		}
		
		
		//while loop
		System.out.println("******  Using While*****");
		int n = 0;
		while (n < ll.size()) {
			System.out.println(ll.get(n));
			n++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
