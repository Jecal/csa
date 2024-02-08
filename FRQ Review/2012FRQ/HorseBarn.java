public class HorseBarn {
    private Horse[] spaces;
    public HorseBarn(int spaceAmount) {
        spaces = new Horse[spaceAmount];
    }
    public void setSpace(int index, Horse inputHorse) {
        spaces[index] = inputHorse;
    }
    public int findHorseSpace(String name) {
        // return index at which horse is found
        for(int i = 0; i < spaces.length; i++) {
            if(spaces[i] != null && spaces[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }   
    public void consolidate(){
        Horse[] newSpaces = new Horse[spaces.length]; // create a new array the length of the input array
        int x = 0;
        for(int i = 0; i < spaces.length; i++)
            if(spaces[i]!=null) {
                newSpaces[x] = spaces[i];
                x++;
            }
        spaces = newSpaces;
    }
}
