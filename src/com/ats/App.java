package com.ats;
import java.util.Scanner;
import com.ats.except.studentRollException;
import com.ats.model.Student;
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll of the student: ");
		long roll = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Name of the student: ");
		String sname = sc.nextLine();
		System.out.println("Enter marks % of the student: ");
		double mp = sc.nextDouble();
		Student st = null;
		try {
			if (roll <= 0) {
				throw new studentRollException(roll);
			}
			Student St = new Student(roll, sname, mp);
		} catch (studentRollException ex) {
			System.out.println(ex);
			roll = 1;
			st = new Student(roll, sname, mp);
		}finally {
			System.out.println(st);
		}
	}

}
