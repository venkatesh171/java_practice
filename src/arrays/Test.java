package arrays;

public class Test {
	public static void main(String[] arr) {
		Student[] students = new Student[10];
		
		Student s1 = new Student(1, "venky");
		Student s2 = new Student(2, "venky2");
		students[0] = s1;
		students[1] = s2;
		for (Student s: students) {
			if (s != null) {
				System.out.println("id  = " + s.id +"\nname = " + s.name);
			}
		}
	}
}
