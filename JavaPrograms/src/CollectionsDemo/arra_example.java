
	/*	 ArrayList<String> arrlst1 = new ArrayList<>(Arrays.asList("banana","apple","Guava","Chiku"));
		 
		 boolean test = arrlst1.contains("apple");
		 System.out.println(test);
		 
		 int test1 = arrlst1.indexOf("apple");
		 System.out.println(test1); 
		 
		 boolean test2 =  arrlst1.contains("Lion");
		 System.out.println(test2);
		 
		 int test3 = arrlst1.indexOf("Lion");
		 System.out.println(test3);
		 */


package CollectionsDemo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

public class arra_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[5]; // Static array
		 arr1[0] = 1;
		 arr1[1] = 2;
		 arr1[2] = 3;
		 
		 
//		  Dynamic array list
		//1. Can contain duplicate values/elements.
		//2. Maintains  insertion order.
		//3. Synchronized 
		//4. allows ramdom access to fetch the elements because it stores the values on the basis of indexes.

		 ArrayList ar = new ArrayList<>();
		 
		 ar.add(10);
		 ar.add(20);
		 ar.add(30);
		 
		 System.out.println(ar.size()); //Size of array
		 
		 ar.add(40);
		 ar.add(50);
		 ar.add(12.33);
		 ar.add("TEST");
		 ar.add(true);
		 
		 
		 
		 System.out.println(ar.get(4)); // to get the value at particular index
		 
		 
		 //to print the values from the arraylist: 
		 //1. For loop
		 //2. Iterator
		 
		 
		 for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		 
		 //generic or non generic
		 
		 //generic arraylist
		 
		 
		 ArrayList<Integer> arint = new ArrayList<Integer>();
		 arint.add(100);
		 
		 ArrayList<String> arstr = new ArrayList<String>();
		 arstr.add("Aniket");
		 
		 //Employee class objects
		 
		Employee e1 =  new Employee("Aniket", 30, "IT");
		Employee e2 = new Employee("Pratik", 27, "DEV");
		Employee e3 = new Employee("Divya", 29, "BA");
		
		//Create arraylist 
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// Iterator to traverse the values
		
		Iterator<Employee> ITR  = ar4.iterator();
		while (ITR.hasNext()) {
			Employee emp = ITR.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		 
		 //******************************
		
		
		//AddAll()
		
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("TEST");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		
		ar6.add("DEV");
		ar6.add("JAVA");
		ar6.add("JSSCRIPT");
		 
		ar5.addAll(ar6);
		
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//REmove all 
		
		ar5.removeAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//Retain all - only common element printed 
		 
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("TEST");
		ar7.add("Selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		
		ar8.add("DEV");
		ar8.add("JAVA");
		ar8.add("TEST");
		 
		ar7.retainAll(ar8);
		
		for (int i = 0; i <  ar7.size(); i++) {
			System.out.println(ar7.get(i));
			
		}
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 
		 
		 
		 
		 
	}

}
