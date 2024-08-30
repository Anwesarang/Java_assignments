package Java_assignments.assign5;
import java.util.Scanner;
class Complex{
	double a1;
	double a2;
	double b1;
	double b2;
	Complex(double a1,double a2,double b1,double b2){
		this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
	}
	double sumReal(){
		double sumreal = a1+a2;
		return sumreal;
	}
	double sumIma(){
            double sumima = b1+b2;
            return sumima;
    }
    double subReal(){
        double subreal = a1-a2;
        return subreal;
    }
    double subIma(){
            double subima = b1-b2;
            return subima;
    }
    double prodReal(){
            double prodreal = (a1*a2) - (b1*b2);
            return prodreal;
    }
    double prodIma(){
            double prodima = (a1*b2) + (a2*b1);
            return prodima;
    }
	void printData(){
		System.out.println("Sum of two complex no.:"+sumReal()+" + "+sumIma()+"i");
        System.out.println("Sub of two complex no.:"+subReal()+" + "+subIma()+"i");
        System.out.println("product of two complex no.:"+prodReal()+" + "+prodIma()+"i");
	}
}
public class p1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the real imaginary part of first number:");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
        System.out.print("Enter the real imaginary part of second number:");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
		Complex c = new Complex(a1,a2,b1,b2);
		c.printData();
        sc.close();
	}
}
