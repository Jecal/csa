import java.util.Scanner;

public class Main
{
    static boolean play = true;
	public static void main(String[] args) {
        Board b = new Board();
        while(play) {
            System.out.println("Options: 1. Print, 2. Resize, 3. Enter, 4. Overwrite, 5. Clear, 6. Exit");
            // create a variable to store the input
            int intInput = intIn(0, 6);
            switch(intInput){
                case 1: // printing board
                    b.print();
                    break;
                case 2: // resize the board
                    System.out.println("Enter the new width: ");
                    int width = intIn(1, Integer.MAX_VALUE);
                    System.out.println("Enter the new height: ");
                    int height = intIn(1, Integer.MAX_VALUE);
                    b.update(height, width);
                    break;
                case 3: // write on the board without overwriting pre-exisiting characters
                    System.out.println("Enter text: ");
                    String text = sIn();
                    System.out.println("Enter starting x coordinate: ");
                    int startX = intIn(0, b.getX()-1);
                    System.out.println("Enter starting y coordinate: ");
                    int startY = intIn(0, b.getY()-1);
                    System.out.println("Horizontal? (true/false)");
                    String horizontal = sIn();
                    boolean isHorizontal = !bIn(horizontal);
                    b.loadWord(text, startX, startY, isHorizontal);
                    break;
                case 4: // same as 3, overwriting allowed
                    System.out.println("Enter text: ");
                    String aText = sIn();
                    System.out.println("Enter starting x coordinate: ");
                    int aX = intIn(0, b.getX()-1);
                    System.out.println("Enter starting y coordinate: ");
                    int aY = intIn(0, b.getY()-1);
                    System.out.println("Horizontal? (true/false)");
                    String aHorizontal = sIn();
                    boolean isAHorizontal = !bIn(aHorizontal);
                    b.write(aText, aX, aY, isAHorizontal);
                    break;
                case 5:
                    b.propagate();
                    break;
                case 6:
                    play = false;
                    break;
            }
        }
	}
	
    private static boolean bIn(String check) {
        boolean cont = true;
        while(cont) {
            try {
                if(check.equals("true")) {
                    return true;
                } else if(check.equals("false")){
                    return false;
                }
                cont = false;
            } catch (Exception e) {
                System.out.println("Enter only 'true' or 'false'");
            }
        }
        return true;
    }

	private static int intIn(int low, int high)
    {
        boolean cont = true;
        Scanner keyboard = new Scanner (System.in);
        String input;
        boolean invalid = true;
        int choice=0;
        while (cont)        
        {
            try
            {
                input = keyboard.nextLine ();
	            choice = Integer.parseInt (input);
	            if (choice<low || choice>high)
	                System.out.println("Please select a number between " + low + " and " + high);
	            else
	                cont = false;
            }
        	catch (Exception e)
        	{
	            System.out.println ("Please enter a number");
        	}
        }
        return choice;
    }
  
    private static String sIn()
    {
        boolean cont = true;
        Scanner keyboard = new Scanner (System.in);
        String input="";
        boolean invalid = true;
        while (cont)        
        {
            try
            {
                input = keyboard.nextLine ();
	            cont = false;
            }
        	catch (Exception e)
        	{
	            System.out.println ("Invalid input");
        	}
        }
        return input;
    }
}
