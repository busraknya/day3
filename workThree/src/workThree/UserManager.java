package workThree;


public class UserManager {
	
	public void add(User user) {
		System.out.println(user.firstName+ " " +user.lastName+ " adl� kullan�c� kaydedildi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

}
