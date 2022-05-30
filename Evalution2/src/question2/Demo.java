package question2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter of students: ");
		int n = scanner.nextInt();

		Student[] students = new Student[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter detail of student: " + (i + 1));
			System.out.println("Enter Roll: ");
			int roll = scanner.nextInt();
			System.out.println("Enter Name: ");
			String name = scanner.next();
			System.out.print("Enter Address: ");
			scanner.nextLine();
			String address = scanner.nextLine();
			System.out.println("Enter marks: ");
			int marks = scanner.nextInt();

			Student s1 = new Student(roll, name, address, marks);
			students[i] = s1;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("==================================================");
			System.out.println("Details of student: " + (i + 1));
			System.out.println(students[i]);
			sum += students[i].getMarks();

		}

		System.out.println("==================================================");
		System.out.println("==================================================");
		System.out.println("Average of students marks: " + (sum / n));

	}

}
