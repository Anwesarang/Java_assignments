package Java_assignments.assign6;
interface dept{
	String deptnm = "cse";
	String depthd = "ALOK RANJAN PAL";
	void showdept();
}
class Hostel{
	String hostnm,hostloc,roomno;
	void rdhostdata(String hostnm,String hostloc,String roomno){
	this.hostnm = hostnm;
	this.hostloc = hostloc;
	this.roomno = roomno;
	}
	void showhostdata(){
		System.out.println("the hostel name = "+hostnm);
		System.out.println("the hostel location = "+hostloc);
		System.out.println("the roomno = "+roomno);
	}
}
class Student extends Hostel implements dept{
	String stunm,regno,elecsub;
	double avg;
	void rdstudata(String stunm,String regno,String elecsub,double avg){
	this.stunm = stunm;
	this.regno = regno;
	this.elecsub = elecsub;
	this.avg = avg;
	}
	void showstudata(){
		System.out.println("the student  name = "+stunm);
                System.out.println("the student reg no = "+regno);
                System.out.println("the elective subject of student = "+elecsub);
		System.out.println("the avg no ="+avg);
	}
	public void showdept(){
		System.out.println("the dep name = "+deptnm);
                System.out.println("the dept HOD name = "+depthd);
	}
}
class p5{
	public static void main(String args[]){
		Student s = new Student();
		s.rdstudata("Anwesha","1010","AI",85.78);
		s.showstudata();
		s.showdept();
		s.rdhostdata("Green Hostel","kolaghat","201");
		s.showhostdata();
	}
}
