package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentList {
	private Map<String, Student> students;

	public Map<String, Student> getStudents() {
		return students;
	}

	public void setStudents(Map<String, Student> students) {
		this.students = students;
	}

//	public void print() {
//		Set<Map.Entry<String, Student>> set = students.entrySet();
//		for (Map.Entry<String, Student> student : set) {
//			System.out.println(student.getValue().getName());
//		}
//	}

	public void print() {
		Set set = students.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			String str = (String) e.getKey();
			Student student = (Student) e.getValue();
			System.out.println(str+" "+student.getNo()+": "+student.getName() + " got " + student.getMarks());
		}
	}
}
