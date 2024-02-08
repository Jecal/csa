public class Main {
    public static void main(String[] args) {
        // Question 1, Iteration
        // int[] array1 = {5, 2, 10, 6, 4, 3, 9};
        // int[] array2 = addNum(array1, 2, 4, 4);
        // for (int x : array2) 
        //     System.out.print(x + ", ");
        // Expected Result: {0, 0, 13, 0, 9, 0, 0}
        /*
         * # Explanation:
         * - array1 = {5, 2, 10, 6, 4, 3, 9}, addNum{array1, 2, 4, 4} is the answer
         * - addNum is a method which creates a new array which is the same length as the input array
         * - the value of the input array at 2 is 10, add 3 to that value, resulting in 13 being the value at index 2 of the new array
         * - the value of the input array at 4 is 4, add 4 to that value, resulting in 8 being the value at index 4 of the new array
         * - the value of the input array at 4 is 4, add 5 to that value, resulting in 9 being the value at index 4 of the new array
         * # Key Takeaways
         * - remember that it is referencing the original array
         * - reference the original value at the array, not the updated new value
         */

        // Question 2, Missing Header
        // Expected Result: Correct Header, (int k = arr.length - 2; k >= 0; k--)
        /*
         * Explanation:
         * - Checking for two consecutive elements which are equal to each other
         *  - Ex: [true, true, false], [false, true, false, false]
         * - Sets k equal to the length of the given array minus 2
         *  - minus 1 accounts for how indexes are counted, which start from 0
         *  - minus 1 accounts for how you are checking, as you are checking the current index and the index over, which is [i, i+1]
         * - Condition is if k is greater than or equal to 0
         *  - Greater than 0 because you are starting from the end of the lsit
         *  - Equal to 0 because k represents the index, so you need to account for the starting index
         */

        // Question 3, Return number of strings of length greater than or equal to 3 in an array of Strings
        // String[] array = new String[3];
        // array[1] = "bruh";
        // System.out.println(array[0].length());
        // Expected Result: Loop runs
        /*
         * Precondition: String[] arr contains at least 1 initialized element
         * Explanation:
         * - Running through each wrong explanation
         *  - Even if String[] arr contains at 
         * Keypoints:
         * - the length of a null element cannot be taken, returns null pointer exception
         */

        /*
        System.out.println();
        // Question 4, print result
        String[] arr = new String[5];
        if (arr.length != 0)
            arr[3] = arr[3] + "\0";
        for (String s:arr)
            if(s != null)
                System.out.println(s+"-");

        // Question 4 related study
        String[] arr2 = new String[2];
        if (arr2[1] == null)
            System.out.println(arr2[1]);
        arr2[1] = arr2[1] + arr2[0];
        if (arr2[1] == null)
            System.out.println(arr2[1]);
        arr2[1].length();
        */

        /*
        // Question 5, Advanced For Loop iteration
        int[] arr = new int[10];
        arr[1] = 3;
        arr[2] = 0;
        arr[3] = 7;
        int sum = 0;
        for(int x : arr) {
            if (x==0)
                sum++;
            else
                sum += x;
        }
        System.out.println(sum);
        */

        /*
        // Question 6, Array Iteration
        int[] arr = {10, 20, 30, 40, 50};
        int i = 0;
        int sum = 0;
        System.out.println("index over value, sum, index current value");
        for(int x : arr) {
	        if(i<arr.length-1)
		        arr[i+1] = x+sum;
                System.out.print(arr[i+1] + " ");
	        sum += x;
            System.out.print(sum + " ");
	        System.out.println(arr[i]);
	        i++;
        }
        */

        // Question 7: Advaned For Loops
        int[] arr = {10, 20, 30, 40, 50};
        for(int x : arr)
	        if((x/10)%2==0)
		        x = x*2;
        for(int x : arr)
            System.out.println(x);
    }

    // Question 1 Method
    public static int[] addNum (int[] array, int first, int second, int third) {
        int[] newArray = new int[array.length]; // create new array which is the length of the input array, all indices filled with 0
        newArray[first] = array[first] + 3; // at index "first", add 3 to the value at that current index
        System.out.println(newArray[first]);
        newArray[second] = array[second] + 4; // at index "second" add 4 to the value at that current index
        System.out.println(newArray[second]);
        newArray[third] = array[third] + 5; // at index "third" add 5 to the value at that current index
        System.out.println(newArray[third]);
        return newArray; // return new array
    }

    // Question 2 Method
    public static boolean twoInARow(int[] arr) {
        for(int k = arr.length - 2; k >= 0; k--) {
            if (arr[k] == arr[k+1])
                return true;  
        }
        return false;
    }

    // Question 3 Method
    public static int checkString(String[] arr) {
        int count = 0;
        for (int k = 0; k <arr.length; k++)
            if (arr[k].length() >= 3)
                count++;
        return count;
    }
}
