import java.util.Date;
import java.util.*;
import java.lang.*;


/*
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private ArrayList <Student> foo;


	/*
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
        this.foo = new ArrayList<Student>(Arrays.asList(students));
	}

	@Override
	public Student[] getStudents() {

	    return students;

       		// Add your implementation here

	}

	@Override
	public void setStudents(Student[] students) {

        if (students == null){
            throw new IllegalArgumentException();
        }
        else{

            this.students = students;

        }


		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
	     if (students == null){
            throw new IllegalArgumentException();
        }
       return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
	    if (students == null){
            throw new IllegalArgumentException();
        }


        students[index] = student;


	}

	@Override
	public void addFirst(Student student) {
		if (student == null ) throw new IllegalArgumentException();
		else {
			int i=this.students.length;
		for(int j=i;j>0;j--){
		this.students[j]=this.students[j-1];
}
		this.students[0]=student;
		this.students[i+1]=null;

		
System.out.println("\n\ndone...\n\n");
            
			
		}
	}

	@Override
	public void addLast(Student student) {
		//Still to be Reviewed
		if (student == null ) throw new IllegalArgumentException();
		else {
			ArrayList <Student>at = new ArrayList<Student>();
			at = (ArrayList<Student>) Arrays.asList(students);
			at.add(students.length, student);
			students = null;
			students = (Student[]) at.toArray();
		}
	}

	@Override
	public void add(Student student, int index) {


        if (student == null ) throw new IllegalArgumentException();
		else {
			

            foo.add(index, student);

		}
		
	}

	@Override
	public void remove(int index) {
	    
			

            foo.remove(index);


		
	}

	@Override
	public void remove(Student student) {
		 if (student == null ) throw new IllegalArgumentException();
		else {
			int index = foo.indexOf(student);
            foo.remove(index);    
		}
	}

	@Override
	public void removeFromIndex(int index) {
		foo.remove(index);
	}

	@Override
	public void removeFromElement(Student student) {
		foo.remove(student);
	}

	@Override
	public void removeToIndex(int index) {
		foo.remove(index);
	}

	@Override
	public void removeToElement(Student student) {
		foo.remove(student);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if (date == null) throw new IllegalArgumentException();
		else {
			Student []st = new Student[students.length];
			int count =0;
			for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate().compareTo(date) == 0) {
				st[count] = students[i];
				count++;
			}
            }

			Student []ts = new Student[count];
			
			for(int i=0;i<count;i++) {
				ts[i] = st[i];
			}
			return ts;
		}
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		if (student == null) throw new IllegalArgumentException();
		else{
		for(int i=0;i<students.length;i++) {
			if(student.getId() == students[i].getId()) return students[i+1];
		}
}
		return null;
	}


}
