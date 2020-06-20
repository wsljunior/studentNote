package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter data of student: ");
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("First note: ");
		student.firstNote = sc.nextDouble();
		System.out.println("Second note: ");
		student.secondNote = sc.nextDouble();
		System.out.println("third note: ");
		student.thirdNote = sc.nextDouble();
		student.finalGrade();
		student.verification();
		sc.close();
	}

}
