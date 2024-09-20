package Java_assignments.assign6;
class Student{
	int roll;
	void getroll(int roll){
		this.roll = roll;
	}
	void displayRoll(){
        System.out.println("Roll number = "+roll);
	}
}
class Test extends Student{
	float m1,m2;
	void getMarks(float m1,float m2){
		this.m1 = m1;
		this.m2 = m2;
	}
	void displayMarks(){
        System.out.println("MARKS 1 = "+m1);
        System.out.println("MARKS 2 = "+m2);
	}
}
interface Games{
	float gamewt = 8.0f;
	void displaywt();
}
class Result extends Test implements Games{
	public void displaywt(){
        System.out.println("Games weight = "+gamewt);
	}
	void displayRes(){
		displayRoll();
		displayMarks();
		displaywt();
	}
}
class p6{
	public static void main(String arg[]){
	Result r = new Result();
	r.getroll(30);
	r.getMarks(87.0f,92.0f);
	r.displayRes();
	}
} 
