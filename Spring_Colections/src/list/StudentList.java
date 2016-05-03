package list;

import java.util.List;

public class StudentList {
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void print(){
		//System.out.println(students);
		for(Student student: students){
			//System.out.println(student);
			System.out.println("Student " + student.getNo()+": "+student.getName()+" got "+student.getMarks()+" marks.");
		}
	}
}
