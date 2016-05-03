package spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentsList.xml");
		Student stu = (Student) context.getBean("stu1");
		System.out.println("ID : "+stu.getId());
		System.out.println("Name : "+stu.getName());
		System.out.println("Marks : "+stu.getMarks());

	}

}
