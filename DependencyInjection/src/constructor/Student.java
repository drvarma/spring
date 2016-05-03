package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	private String name;
	private int no;
	private double marks;
	
	public Student(String name, int no, double marks){
		this.name = name;
		this.no = no;
		this.marks = marks;
	}
	
	public Student(String name, int no){
		this.name = name;
		this.no = no;
	}
	
	public Student(int no) {
		this.no = no;
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student_constructor.xml");
		Student stu = (Student) context.getBean("stu");
		Student stu1 = (Student) context.getBean("stu1");
		Student stu2 = (Student) context.getBean("stu2");
		Student stu3 = (Student) context.getBean("stu3");
		Student stu4 = (Student) context.getBean("stu4");
		
		System.out.println(stu.getName() + " " + stu.getNo());
		System.out.println(stu1.getName()+" "+ stu1.getNo());
 		System.out.println(stu2.getName()+" "+ stu2.getNo());
		System.out.println(stu3.getName()+ " "+ stu3.getNo());
		System.out.println(stu4.getName() + " " + stu4.getNo());
		
		

	}

}
