package setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	private String name;
	private int no;
	
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
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("student_setter.xml");
		Student stu = (Student) context.getBean("stu1");
		System.out.println(stu.getName() + " " + stu.getNo());
	}
	
}
