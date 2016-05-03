package set;

import java.util.Set;

public class StudentList {
	private Set<Student> students;
	
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public void print(){
		System.out.println(students);
		for(Student student: students){
			System.out.println(student);
			//System.out.println("Student " + student.getNo()+": "+student.getName()+" got "+student.getMarks()+" marks.");
		}
	}
}
