package list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentList.xml");
		StudentList students = (StudentList) context.getBean("students");
		students.print();

	}

}
