package in.ac.sharda;

public class Departmentdemo {

	public static void main(String[] args) {
		Department d = new Department(21);
		for(int i=1;i<=25;i++) {
		d.addStudent(new Student(i,"Garvit"));
		}
		d.printStudents();

	}

}
