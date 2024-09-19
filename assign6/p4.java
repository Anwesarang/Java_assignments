package Java_assignments.assign6;
interface Vehical{
	void vehicalType();
}
interface Book{
	void bookType();
}

class MobBooksp implements Vehical,Book{
	public void vehicalType(){
		System.out.println("the vehical is car");
	}
	public void bookType(){
		System.out.println("these are cse books");
	}
}

class p4{
	public static void main(String args[]){
		MobBooksp sp = new MobBooksp();
		sp.vehicalType();
		sp.bookType();
	}
}
