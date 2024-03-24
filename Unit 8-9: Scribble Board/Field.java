public class Field
{
    protected char[][] frame;
    protected boolean[][] inUse;

    public Field()
    {
        frame = new char[1][8];
        inUse = new boolean[1][8];
        propagate();
    }
    
    protected void update(int x, int y)
    {
        frame = new char[x][y];
        inUse = new boolean[x][y];
        propagate();
    }
    
    protected void propagate()
    {
        for (int i = 0; i<frame.length;i++)
            for (int j = 0; j<frame[0].length;j++)
            {
                frame[i][j]='*';
                inUse[i][j]=false;
            }
    }
    
    public void print()
    {
        for (int i = 0; i<frame.length+2; i++)
        {
            for (int j = 0; j<frame[0].length+2;j++)
            {
                if (i==0||i==frame.length+1)
                    if (j==0||j==frame[0].length+1)
                        System.out.print('+');
                    else
                        System.out.print('-');
                else if (j==0||j==frame[0].length+1)
                    System.out.print('|');
                else
                    System.out.print(frame[i-1][j-1]);
            }
            System.out.println();
        }
    }
    
    public void loadWord (String pass)
    {
        for (int i = 0; i< Math.min(pass.length(),frame[0].length);i++)
            frame[0][i]=pass.charAt(i);
    }
    
}