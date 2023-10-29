import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class main {
	public static void main(String[] args) {
		// test case ints: 7861, 8191, 7644, 5813
		// Random rand = new Random();
		// int rand_int = rand.nextInt(7862);
		// System.out.println("ID generated: " + rand_int);

		studentid stud1 = new studentid('W', 'N', true, 2);
		studentid stud2 = new studentid('W', 'T', true, 1);
		// System.out.println(stud1.getID());
		// System.out.println(stud1.getGrade());
		// System.out.println(stud1.getFirstN());
		// System.out.println(stud1.getLastN());
		// System.out.println(stud1.getIsMale());
		// stud1.print();
		// stud2.print();
		// stud1.compareTo(stud2);

		/* sample code for testing */
		// Declare an array of 20 StudentIDs
		studentid[] array = new studentid[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = new studentid((int) (Math.random() * 8192)); // generate random IDs
		}

		// import java.util.* required at the top to import Arrays library
		Arrays.sort(array); // sorts array by whatever is specified in compareTo

		// Print out the sorted array
		for (int i = 0; i < array.length; i++) {
			array[i].print();
		}
		/* sample code for testing */

		int comp = stud1.compareTo(stud2);
		if (comp == 1)
			System.out.println("dudes older");
		else if (comp == 0)
			System.out.println("dudes are the same");
		else
			System.out.println("nah");
	}
}
