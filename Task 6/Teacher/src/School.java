public class School
{
   public static void main (String [] args)
   {
   
	  // Create three instances of Student class
      Student sally = new Student("Sally", 15, 8, 'D');
      Student sipho = new Student("Sipho", 17 , 11, 'A');
      Student rajesh = new Student("Rajesh", 19, 12, 'B');
      
      System.out.println("Students\n");
      System.out.println(sally.toString() + "\n");
      System.out.println(sipho.toString() + "\n");
      System.out.println(rajesh.toString());
      
      // Create three instances of teacher class
      Teacher dayo = new Teacher("Dayo", 25, 3, "Mathematics", 20000);
      Teacher memphis = new Teacher("Memphis", 30, 7, "English", 35000);
      Teacher scott = new Teacher("Scott", 22, 1, "Music", 10000);
      
      System.out.println("Teachers\n");
      System.out.println(dayo.toString() + "\n");
      System.out.println(memphis.toString() + "\n");
      System.out.println(scott.toString() + "\n");
      
      // create three instances of secretary class
      Secretary victor = new Secretary("Victor", 25, "0603476139", "Meeting with the boss", 2000);
      Secretary konrad = new Secretary("Konrad", 30, "06035478945", "Submit annual report", 3500);
      Secretary jose = new Secretary("Jose", 22, "03025478968", "print statements", 1000);
      
      System.out.println("Secretaries\n");
      System.out.println(victor.toString() + "\n");
      System.out.println(konrad.toString() + "\n");
      System.out.println(jose.toString() + "\n");
   }
}