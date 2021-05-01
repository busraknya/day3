package workThree;


public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Büşra");
		user1.setLastName("Konya");
		user1.setPassword("012345");
		user1.setEmail("example@example.com");
		
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("abc");
		user2.setLastName("xyz");
		user2.setPassword("98765");
		user2.setEmail("example2@example.com");
		
		User[] users = {user1,user2};
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.addMultiple(users);
			
		
		Student student = new Student("Ülke/İl", "Java");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToAddress(student.address);
		studentManager.joinToCourse(student.course);
		
		Instructor instructor = new Instructor(3, "Engin", "Demiroğ", "12345", "exampe3@example.com", "1.Ders");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addToLesson(instructor.lesson);
		
	}

}

