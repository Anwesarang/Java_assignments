package Java_assignments.assign6;
abstract class Shape{
	abstract void recArea(double len,double bre);
	abstract void cirArea(double rad);
	abstract void squArea(double side);
}
class Area extends Shape{
	void cirArea(double rad){
		double carea = 3.14*rad*rad;
		System.out.println("The area of circle = "+carea);
	}
	void recArea(double len,double bre){
		double rarea = len*bre;
                System.out.println("The area of rectangle = "+rarea);
	}
	void squArea( double side){
		double sarea = side*side;
		System.out.println("The area of squre = "+sarea);
	}

}
class p2{
	public static void main(String args[]){
		Area a = new Area();
		a.cirArea(7);
		a.recArea(5,7);
		a.squArea(4);
	}
}
