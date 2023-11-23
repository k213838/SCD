package application;

public class Task {
	String name;
	String Status = "Incomplete";
	public Task(String name) {
		this.name = name;
	}
	void setStatusComplete() {
		this.Status = "Complete";
		
	}
	
	
}
