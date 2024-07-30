package pack1;

final public class Child extends FinalDemo {

	// void show() // show is constant in FinalDemo, can't override

	void displayData() {
		System.out.println("displayData () in Child class ");
	}

	void display() {
		System.out.println("display () in child class");
	}
}
/**
 * class FinalChild extend Child{
 * 
 * // child is final, can't inherit it
 */
