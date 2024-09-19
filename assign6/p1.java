package Java_assignments.assign6;
abstract class Animal{
	abstract void mksnd();
	abstract void kidnm();
}

class Cats extends Animal{
	void mksnd(){
		System.out.println("Cats meow");
	}
	void kidnm(){
		System.out.println("the cat's kid is known as a kitten");
	}
}

class Dogs extends Animal{
	void mksnd(){
		System.out.println("Dogs bark");
	}
	void kidnm(){
		System.out.println("the dog's kid is called a puppy");
	}
}

class p1{
	public static void main(String args[]){
	Cats c = new Cats();
	c.mksnd();
	c.kidnm();
	Dogs d = new Dogs();
	d.mksnd();
	d.kidnm();
	}
}
