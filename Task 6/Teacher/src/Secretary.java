
public class Secretary {
	// Attributes
	String name;
	int age;
	String phone;
	String tasks;
	float salary;
	
	// Methods
	public Secretary(String name, int age, String phone, String tasks, float salary) {
	      this.name = name;
	      this.age = age;
	      this.phone = phone;
	      this.tasks =tasks;
	      this.salary = salary;
	   }
	public String toString() {
	      String output = "Name: " + name;
	      output += "\nAge: " + age;
	      output += "\nphone number: " + phone;
	      output += "\ntasks " + tasks;
	      output += "\nsalary " + salary;
	   
	      return output;
	}
}
