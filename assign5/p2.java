package Java_assignments.assign5;
class Vehicle{
	double whlNo;
	double speed;
	Vehicle(double whlNo,double speed){
		this.whlNo = whlNo;
        this.speed = speed;
	}
	void getData()
	{
		System.out.println("The wheel no. of vehicle ="+whlNo);
		System.out.println("The speed of vehicle ="+speed+" km/hr");
	}

}
class Car extends Vehicle{
	double passNo;
	Car(double whlNo,double speed,double passNo){
		super(whlNo,speed);
		this.passNo = passNo;
	}
	void getData()
	{
		super.getData();
		System.out.println("The passengers no. of Vehicle = " +passNo);

	}
}
class Truck extends Vehicle{
	double load;
	Truck(double whlNo,double speed,double load){
                super(whlNo,speed);
                this.load = load;
	}
	void getData()
	{
                super.getData();
                System.out.println("The capacity of Vehicle = " +load+"kg");

	}

}
class p2{
	public static void main(String args[]){
		Car c = new Car(4,15,6);
		c.getData();
		Truck t = new Truck(6,10,50);
		t.getData();
		if(c.speed > t.speed){
			System.out.println("Car is faster.");
		}else{
			System.out.println("Truck is faster.");
		}
	}
}
