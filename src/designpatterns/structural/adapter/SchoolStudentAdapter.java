package designpatterns.structural.adapter;

public class SchoolStudentAdapter implements Student {

	private SchoolStudent student;
	
	public SchoolStudentAdapter(SchoolStudent student) {
		this.student = student;
	}	
	
	@Override
	public String getName() {
		return student.getFirstName();
	}

	@Override
	public String getSurName() {
		return student.getLastName();
	}

	@Override
	public String toString() {
		return "SchoolStudentAdapter [student=" + student + "]";
	}

}
