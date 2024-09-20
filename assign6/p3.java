package Java_assignments.assign6;
abstract class Account{
	String accnm = "1059ANW456";
	String achdnm = "Anwesha Manna";
	String mob= "7479270390";
	double balnc = 70000;
	abstract double withdrawal(double r);
	abstract double deposit(double p);
	void display(){
	}
}
class Saveacc extends Account{
	double amount;
	double withdrawal(double r){
		this.amount = r;
		balnc = balnc - r;
		if(balnc >= 0){
		System.out.println("withdrawal successful");
		}
		return balnc;
	}
	double deposit(double p){
		this.amount = p;
		balnc = balnc + p;
		if(balnc >= 0){
		System.out.println("deposit successful");
		}
		return balnc;
	}
	void display(){
                System.out.println("The account number="+accnm);
                System.out.println("The account holder name="+achdnm);
                System.out.println("The mobile number="+mob);
                System.out.println("The account balance="+balnc);

	}
}
class p3{
	public static void main(String args[]){
		Saveacc s = new Saveacc();
		s.display();
		s.withdrawal(20000);
		s.display();
		s.deposit(30000);
		s.display();
	}
}
