/* #Task 15: Create a class student that has three attributes (name, roll no & marks). Create an array of three
	students and perform following operations
	=> Sort them according to roll no
	=> Sort them according to marks
	=> Print details of topper
   Registration ID: JIRSS1132
   Name: Bipin Kumar
*/
package ArrayAndClassObjects;

class Student {
	// Attributes for student
	String name;
	int rollNumber;
	double marks;
	
		public Student(String name, int rollNumber, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	public String getName() {
			return name;
		}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}

public class StudentDetails{

	public static void main(String[] args) {
		// Array of 3 Students
		Student studentArr[]=new Student[3];
		
		//Intializing Student 1
		studentArr[0]=new Student("Bipin",101,87.23);
		
		// Initializing Student 2
		studentArr[1]=new Student("Raj",119,78.34);
		
		// Initializing student 3
		studentArr[2]=new Student("Shiv",105,81.56);
		
		// => Sorting of Students according to roll no
		// using Bubble sort
		
		for(int i=0;i<studentArr.length;i++)
		{
			Student temp2;
			int  temp=studentArr[i].getRollNumber();
			for(int j=i+1;j<studentArr.length;j++)
			{
				if(temp>studentArr[j].getRollNumber())
				{
					temp2=studentArr[j];
					studentArr[j]=studentArr[i];
					studentArr[i]=temp2;
				}
			}
		}
		
		// Printing Student details in sorted roll number
		System.out.println("----Sorting of Students According to roll no----");
		System.out.println("-Name--------Roll Number--------Marks");
		for(Student x:studentArr) {
			System.out.println(x.getName()+"		"+x.getRollNumber()+"		"+x.getMarks());
		}
		System.out.println();
		
		// =>sorting of Students according to marks
		// using Bubble sort
		for(int i=0;i<studentArr.length;i++)
		{
			Student temp2;
			double  temp=studentArr[i].getMarks();
			for(int j=i+1;j<studentArr.length;j++)
			{
				if(temp>studentArr[j].getMarks())
				{
					temp2=studentArr[j];
					studentArr[j]=studentArr[i];
					studentArr[i]=temp2;
				}
			}
		}
		
		// Printing Student details in sorted roll number
		System.out.println("----Sorting of Students According to Marks----");
		System.out.println("-Name--------Roll Number--------Marks");
		for(Student x:studentArr) {
			System.out.println(x.getName()+"		"+x.getRollNumber()+"		"+x.getMarks());
		}
		System.out.println();
		
		//Print details of topper
		int topperIndex=0;
		double maxMark=0;
		for(int i=0;i<studentArr.length;i++)
		{
			if(maxMark<studentArr[i].getMarks()) {
				maxMark=studentArr[i].getMarks();
				topperIndex=i;
			}
		}
		System.out.println("-----Topper in 3 Student------");
		System.out.println(studentArr[topperIndex].getName()+"		"+studentArr[topperIndex].getRollNumber()+"		"+studentArr[topperIndex].getMarks());
		
		
		
		
		
		
		
	}

}
