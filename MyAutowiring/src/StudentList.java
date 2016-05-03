

public class StudentList {
	private Student stu1;
	private Student stu2;
	private Student stu3;
	
	public Student getStu1() {
		return stu1;
	}
	public void setStu1(Student stu1) {
		this.stu1 = stu1;
	}
	public Student getStu2() {
		return stu2;
	}
	public void setStu2(Student stu2) {
		this.stu2 = stu2;
	}
	public Student getStu3() {
		return stu3;
	}
	public void setStu3(Student stu3) {
		this.stu3 = stu3;
	}
	
	public void print(){
		System.out.println("default");
		System.out.println("Student 1: "+getStu1().getName()+" "+getStu1().getNo());
		System.out.println("Student 2: "+getStu2().getName()+" "+getStu2().getNo());
		System.out.println("Student 3: "+getStu3().getName()+" "+getStu3().getNo());
	}
}

