import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		Instructor insturctor1=new Instructor(1, "Engin Demiro�", 35);
		Instructor insturctor2=new Instructor(2, "Engin Demiro�", 35);
		
		Course course1=new Course(1,"Java+React Kursu","2 ayl�k kamp");
		Course course2=new Course(2,"C# Kursu","2 ayl�k kamp");
		
		Student student1=new Student(1,"Mustafa Demircan",27);
		Student student2=new Student(2,"Mustafa Demircan",28);
		
		Instructor[] insturctors= {insturctor1,insturctor2};
		
		Course[] courses= {course1,course2};
		
		Student[] students= {student1,student2};
		
		for (Instructor insturctor : insturctors) {
			System.out.println(insturctor.id+" "+insturctor.name);
		}
		
		for (Course course : courses) {
			System.out.println(course.id+" "+course.courseName);
		}
		
		for (Student student : students) {
			System.out.println(student.id+" "+student.name);
		}
		
		BusinessClass businessClass=new BusinessClass();
		businessClass.addToCourse(course1);
		businessClass.addToStudent(student1);
		
	}

}
