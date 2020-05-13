
public class Superkeywords_classA_extends {

	// Super keyword is used to call the parent class constructor
	// If Super keyword is not written then it will call default constructor
	// Super keyword should be the 1st statement
	// It should be written in child class always

	public Superkeywords_classA_extends() {

		System.out.println("Parent class constructor");
	}

	public Superkeywords_classA_extends(int i) {

		System.out.println("Prarent class constructor with value i = " + i);
	}

	public Superkeywords_classA_extends(int k, int j) {
		System.out.println("Prarent class constructor with value i = " + k);
		System.out.println("Prarent class constructor with value j = " + j);
	}

}
