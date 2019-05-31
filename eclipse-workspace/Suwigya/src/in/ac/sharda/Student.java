package in.ac.sharda;

public class Student implements IResultArrivedListener {
	private final int rollnumber;
	private final String name;
	private String email;

	public Student(int rn, String n) {
		this.rollnumber = rn;
		this.name = n;
	}

	public Student(int rn, String n, String e) {
		this.rollnumber = rn;
		this.name = n;
		this.email = e;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void attendance() {
		System.out.println("Present");

	}

	public int getRollnumber() {
		return rollnumber;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			return ((Student) obj).getRollnumber() == rollnumber;
		}
		return false;
	}

	@Override
	public void resultArrived() {
		System.out.println("Result just came in.......!!!!"+name);
		
		
	}
}
