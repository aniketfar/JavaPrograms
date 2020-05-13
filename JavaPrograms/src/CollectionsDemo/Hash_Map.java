/*
 * 
 * Hashmap is a class implements Map interface
 * Extends AbstractMap
 * it contains only unique elements
 * Stores the values in key - value pair format
 * it may have one null key and multiple null values 
 * It maintains no order
 * Hashmap is non - synchronized -- not a thread safe
 * concurrent modification exception --fail - fast condition 
 * 
 */

package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer,  String>();
		hm.put(1,"Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");																																														
		hm.put(4, "RFT");
		
		
		
		System.out.println(hm.get(1));
		
//		Access for no key created in hashmap
		System.out.println(hm.get(4));
		
		//iterate hashmap
		
		for(Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey() +"  "+ m.getValue());
		}
		
		
		System.out.println(hm);
		hm.remove(4);
		System.out.println(hm);
		
		// Hash map object for employee
		
		HashMap<Integer, Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Aniket", 30, "Auto test");
		Employee e2 = new Employee("Pratik", 27, "DEV");
		Employee e3 = new Employee("Troy", 21, "Admin");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		
//		Traverse employee emp object using hashmap
		
		for(Entry<Integer, Employee> m : emp.entrySet()){
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key + " info");
			
			System.out.println(e.name +" "+e.age+" "+e.dept);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
