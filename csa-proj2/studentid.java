public class studentid {
    private char firstN;
    private char lastN;
    private boolean isMale;
    private int grade;
    private int ID;
    private String idString;

    public studentid() {
        System.out.println("Enter student id.");
    }

    public studentid(int id) {
        ID = id;
        idString = Integer.toBinaryString(id);
        int len = idString.length();
        int leadz = 13 - len;
        for (int i = 0; i < leadz; i++) {
            idString = "0" + idString;
        }
        // System.out.println(idString);
    }

    public int getID() {
        return ID;
    }

    public int getGrade() {
        String grade = idString.substring(0,2);
        switch(grade) {
            case "00":
                // System.out.println("Freshman");
                return 9;
            case "01":
                // System.out.println("Sophmore");
                return 10;
            case "10":
                // System.out.println("Junior");
                return 11;
            case "11":
                // System.out.println("Senior");
                return 12;
            default:
                return 0;
        }
    }

    public char getFirstN() {
        String stringFirstN = idString.substring(2,7);
        int binaryIntFirstN = Integer.parseInt(stringFirstN, 2);
        firstN = (char) ('A' + (binaryIntFirstN - 1));
        // System.out.println(firstN);
        return firstN;
    }

    public char getLastN() {
        String stringLastN = idString.substring(7,12);
        int binaryIntLastN = Integer.parseInt(stringLastN, 2);
        lastN = (char) ('A' + (binaryIntLastN - 1));
        // System.out.println(lastN);
        return lastN;
    }

    public boolean getIsMale() {
        String isMale = idString.substring(12,13);
        switch(isMale) {
            case "0":
                // System.out.println("Male");
                return true;
            case "1":
                // System.out.println("Female");
                return false;
            default:
                return true;
        }
    }

    public void print() {
        int grade = getGrade();
        char firstN = getFirstN();
        char lastN = getLastN();
        boolean isMale = getIsMale();
        String gender;
        if (ID % 2 == 0) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        String gradeName;
        switch (grade) {
            case 9:
                gradeName = "Freshman";
                break;
            case 10:
                gradeName = "Sophmore";
                break;
            case 11:
                gradeName = "Junior";
                break;
            case 12:
                gradeName = "Senior";
                break;
            default:
                gradeName = "Error";
        }
        System.out.println(gradeName + ", " + firstN + ", " + lastN + ", " + gender);
    }
}
