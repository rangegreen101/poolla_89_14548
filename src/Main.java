import java.lang.*;
import java.util.Date;

public class Main{

    
 static int StudentCount =3;


	public static void main(String[] args){
        


       

       StudentGroup sg = new StudentGroup(StudentCount);
        


        Student a = new Student(10, "Ashok", new Date(), 60);
        Student b = new Student(20, "Venu", new Date(), 80);
        Student c = new Student(30, "Pranay", new Date(), 90);
        Student d = new Student(40, "Rakesh", new Date(), 90);


	    System.out.println("Setting Students information:");

        sg.setStudent(a,0);
        sg.setStudent(b,1);
        sg.setStudent(c,2);

        System.out.println("\n\n\nadding new student\n\n\n");

      
  sg.add(d, 2);

 System.out.println("\n\ndone\n\n\n");


//ShowUser(sg.getStudent(5));
	}


	public static void ShowUser(Student foo){

    
	System.out.println("\n\n--------------\n");
	System.out.println("ID: " + foo.getId());
	System.out.println("Name: " + foo.getFullName());
	System.out.println("Birth Date: " + foo.getBirthDate().toString());
	System.out.println("Avg Mark: " + foo.getAvgMark());
	
	}



}
