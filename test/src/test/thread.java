package test;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class thread {
	static String name = "raghu";
	static int age=25;
	int sal=1234;

	public static void main(String[] args) {
		
		sal=3456;
		age=26;
		/*Thread t = new Thread(){
			public void run(){
				throw new RuntimeErrorException(null, "runtime");
			}
		};
		
		try{
			t.start();
			Thread.sleep(1000);
		} catch (InterruptedException e){
			System.out.println("interr");
		}
		System.out.println("main completed");*/
		
		/*Integer i =null;
		int j=i+1;
		System.out.println("i= "+i);
		System.out.println(", j= "+j);
		
		List<int> ij = new ArrayList<int>();*/
		
		
		String s1="abc";
		String s7 = s1;
		StringBuffer s2 = new StringBuffer(s1);
		String s3 = new String(s1);
		StringBuffer s4 = new StringBuffer(s2);
		StringBuffer s5 = s2;
		System.out.println(s2==s4);
		System.out.println(s2==s5);
		System.out.println(s1==s7);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.equals(s1)+","+s1.equals(s2));
		System.out.println(s3.equals(s1)+","+s1.equals(s3));
		System.out.println(s2.equals(s4)+","+s4.equals(s2));
		System.out.println(s2.equals(s5)+","+s5.equals(s2));
	}

}
