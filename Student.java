public class Student{
	String name;
	double grade;
	public Student(String name,double grade){
		this.name=name;
		this.grade=grade;
	}
	public static void  printStudentGrade(Student[] students){
		for(Student student : students)
			System.out.println("Name: "+student.name +"Grade: "+student.grade);
	}
}

