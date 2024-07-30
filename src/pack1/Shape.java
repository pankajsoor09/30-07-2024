package pack1;

abstract public class Shape { // we have to declare shape class as abstract as it contains abstract method 

	void display() {
		System.out.println("display() in shape class");
	}

	abstract void draw();// draw() is abstract method , can't implement

	public static void main(String[] args) {
		// Shape shape = new Shape (); // cannot create shape class object as it is abstract 
		Shape obj = new Rectangle();// up casting  // rectangle is stored in shape // storing child in parent
		obj.display();
		obj.draw();
	}

}
