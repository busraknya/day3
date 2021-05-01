package workThree;

public class Student extends User{
	
	 String address;
	 String course;
	
	public Student ( String address, String course) {
		
		this.address = address;
		this.course = course;
	}
	public Student() {
		
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}

}
