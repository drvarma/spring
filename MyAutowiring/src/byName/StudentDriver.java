package byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentByName.xml");
		StudentList student = (StudentList) context.getBean("student");
		student.print();
		

	}

}
