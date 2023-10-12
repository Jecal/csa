import java.util.Random;

public class main {
	public static void main(String[] args) {
		// test case ints: 7861, 8191, 7644, 5813
		// Random rand = new Random();
		// int rand_int = rand.nextInt(7862);
		// System.out.println("ID generated: " + rand_int);

		studentid stud = new studentid('W', 'N', true, 3);
		System.out.println(stud.getID());
		System.out.println(stud.getGrade());
		System.out.println(stud.getFirstN());
		System.out.println(stud.getLastN());
		System.out.println(stud.getIsMale());
		stud.print();
	}
}
