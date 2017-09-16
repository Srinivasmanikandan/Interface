package nameconvention;

public class Student {
int studentRollnumber=101;
String studentName="HARI";
public void print(){
	System.out.println("Student roll number is"+" "+ studentRollnumber);
	System.out.println("Student name is"+" "+ studentName);	 
}
	public static void main(String[] args) {
	Student obj=new Student();
	obj.print();

	}

}
