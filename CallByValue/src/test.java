
public class test {
	private String name="raghu";
	private static Integer a=2;
	public static void main(String[] args) {
		test t = new test();
		int i=5;
		int j,b=0;
		b=t.avalue(a);
		j=t.jvalue(i);
		System.out.println(b+","+a);
		System.out.println(j+","+i);

	}
	private int jvalue(int i) {
		++i;
		return i;
	}
	private  int avalue(int a) {
		++a;
		return a;
	}

}
