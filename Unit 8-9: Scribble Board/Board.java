public class Board extends Field {

    public Board() {
        super();
    }

    protected void update(int x, int y) { // Resizes the board calling the update method from Field.java
        super.update(x, y);
    }

    public void reset() { // Resets the board (call the propagate method from Field)
        super.propagate();
    }

    protected int getX() { // get width of board
        return frame.length;
    }

    protected int getY() { // get height of board
        return frame[0].length;
    }

    public void loadWord(String word, int x, int y, boolean horizontal) {
        int startX = x;
        int startY = y;
        int index = 0;
        if (horizontal) {
            while (index < word.length() && startX < frame.length) {
                if (!inUse[startX][startY]) {
                    frame[startX][startY] = word.charAt(index);
                    inUse[startX][startY] = true;
                }
                startX++;
                index++;
            }
        } else {
            while (index < word.length() && startY < frame[0].length) {
                if (!inUse[startX][startY]) {
                    frame[startX][startY] = word.charAt(index);
                    inUse[startX][startY] = true;
                }
                startY++;
                index++;
            }
        }
    }

    public void write(String word, int x, int y, boolean horizontal) {
        int startX = x;
        int startY = y;
        int index = 0;
        if (horizontal) {
            while (index < word.length() && startX < frame.length) {
                frame[startX][startY] = word.charAt(index);
                inUse[startX][startY] = true;
                startX++;
                index++;
            }
        } else {
            while (index < word.length() && startY < frame[0].length) {
                frame[startX][startY] = word.charAt(index);
                inUse[startX][startY] = true;
                startY++;
                index++;
            }
        }
    }
}
