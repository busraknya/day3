package workThree;


public class Instructor extends User {
	
	String lesson;

	public Instructor(int id, String firstName, String lastName, String password, String email, String lesson) {
		super(id, firstName, lastName, password, email);
		this.lesson = lesson;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

}
