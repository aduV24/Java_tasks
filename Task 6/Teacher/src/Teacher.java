
public class Teacher {
	// Attributes
	String name;
	int age;
	int experience;
	String subject;
	float salary;
	
	// Methods
	public Teacher(String name, int age, int experience, String subject, float salary) {
	      this.name = name;
	      this.age = age;
	      this.experience = experience;
	      this.subject =subject;
	      this.salary = salary;
	   }
	public String toString() {
	      String output = "Name: " + name;
	      output += "\nAge: " + age;
	      output += "\nnumber of experience: " + experience;
	      output += "\nsubject " + subject;
	      output += "\nsalary " + salary;
	   
	      return output;
	   }
}
