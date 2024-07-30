package pack1;

public class FinalDemo {

	final int COUNT = 100;// while declaring need to be initialize because it is constant and cannot be
							// changed through out the program
	int number;

	void displayData() {
		// COUNT++; COUNT is final /constant cannot change it's value
		System.out.println("COUNT : " + COUNT);
		number++;
		System.out.println("number : " + number);
	}

	final void show() {
		System.out.println("final show() in FinalDemo class");
		System.out.println("Count : " + COUNT);
		System.out.println("Number: " + number);
	}

	public static void main(String[] args) {
		FinalDemo demo = new FinalDemo();
		demo.number = 10;
		// demo.COUNT =200 ; // COUNT is final /constant cannot change its value

		demo.displayData();
		demo.show();

		demo = new Child();// up casting // due to super statement when child obj is created a parent obj
							// associated is created ...
		demo.displayData();
		// demo.display();// child specific need to do down casting
		((Child) demo).display();
	}
}
