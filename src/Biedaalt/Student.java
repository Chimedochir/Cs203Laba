package Biedaalt;
public class Student  {
	public String code;// код
	 public Double gpa;// голч дүн
	 public String lessons;// үзсэн хичээлүүд
	 public Student(String co, String le, double gp) {
			this.code=co;
			this.gpa=gp;
			this.lessons=le;
	if(gp>95) {
		 this.gpa=4.0;
	 }else if(gp>90) {
		 this.gpa=3.7;
	 }else if(gp>87) {
		 this.gpa=3.4;
	 }
	 }
}
