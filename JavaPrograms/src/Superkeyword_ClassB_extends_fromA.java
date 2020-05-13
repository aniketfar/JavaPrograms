
public class Superkeyword_ClassB_extends_fromA extends Superkeywords_classA_extends {

	// Super keyword is used to call the parent class constructor
	// If Super keyword is not written then it will call default constructor
	// Super keyword should be the 1st statement
	// It should be written in child class always

	public Superkeyword_ClassB_extends_fromA() {
		super();
	}

	public Superkeyword_ClassB_extends_fromA(int i) {

		super(i);
	}

	public Superkeyword_ClassB_extends_fromA(int k, int j) {
		super(k, j);
	}

	public static void main(String[] args) {
		Superkeyword_ClassB_extends_fromA C1 = new Superkeyword_ClassB_extends_fromA();
		Superkeyword_ClassB_extends_fromA C2 = new Superkeyword_ClassB_extends_fromA(10);
		Superkeyword_ClassB_extends_fromA C3 = new Superkeyword_ClassB_extends_fromA(20, 30);

	}

}
