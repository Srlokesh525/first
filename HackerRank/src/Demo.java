//write a java program to create student object & perform the below mentioned operations
//1.create a method to read 5 students details.
//2.create a method to find the average age of students.
//3.Display the details using to String Method
import java.math.BigInteger;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int n = scanner.nextInt();
		 Student[] cr = createStudent(n);
		 Student[] in = initialize(cr);
		 display(in);
		 average(in);
		 scanner.close();
	}

	private static void average(Student[] in) {
		int sum=0;
		int count=0; 
		for (int i = 0; i < in.length; i++) {
			sum+=in[i].age;
			count++;
		}
		System.out.println("Average age of Students  : "+sum/count);
	}

	private static void display(Student[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	private static Student[] initialize(Student[] s) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter the details of students :"+ (i+1));
			System.out.println("Enter name :");
			String name= sc.next();
			System.out.println("Enter age :");
			int age= sc.nextInt();
			System.out.println("Enter Address :");
			String address= sc.next();
			System.out.println("Enter contact_number :");
			BigInteger contact_number= sc.nextBigInteger();
			s[i].name = name;
			s[i].age = age;
			s[i].address = address;
			s[i].contact_number = contact_number;
		}
		sc.close();
		return s;
	}
	

	private static Student[] createStudent(int n) {
		Student[] s = new Student[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
		}
		
		return s;
	}
}

/*
import java.util.Scanner;

public class Student {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter student address: ");
            String address = scanner.nextLine();

            students[i] = new Student(name, age, address);
        }

        double avgAge = findAverageAge(students);
        System.out.println("Average age of students: " + avgAge);

        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].toString());
        }
    }

    public static double findAverageAge(Student[] students) {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += students[i].age;
        }
        return sum / 5;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
*/