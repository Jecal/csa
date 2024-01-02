import java.lang.Math;

public class cat
{
    private int lifePoints = 2000; // Life points int
    private String name = "Your cat";
    private boolean life = true;
    // - - - - - //
    public cat() // first case: no arguments
    {
        System.out.println(name + " has " + lifePoints + " life points.");
    }
    public cat(int l) // second case: one argument, int = lifePoints
    {
        if (l > 9999)
        {
            l = 9999;
        }
        if (l <= 0)
        {
            l = 1;
        }
        lifePoints = l;
        System.out.println(name + " has been birthed into this world with " + lifePoints + " life point(s).");
    }
    public cat(String n) // third case: one argument, String = name
    {
        name = n;
        System.out.println(name + " has been birthed into this world with " + lifePoints + " life point(s).");
    }
    public cat(String n, int l) // fourth case: two arguments, String = name, int = lifePoints
    {
        if ( l > 9999 )
        {
            l = 9999;
        }
        if ( l <= 0 )
        {
            l = 1;
        }
        lifePoints = l;
        name = n;
        System.out.println(name + " has been birthed into this world with " + lifePoints + " life point(s).");
    }
    // - - - - - //
    public int getLP()
    {
        System.out.println(name + " lifePoints: " + lifePoints);
        return lifePoints;
    }
    // - - - - - //
    public boolean isAlive()
    {
        if (lifePoints > 0)
        {
            life = true;
            System.out.println(name + " is still alive.");
        }
        if (lifePoints <= 0)
        {
            lifePoints = 0;
            life = false;
            System.out.println(name + " is dead");
        }
        return life;
    }
    // - - - - - //
    public void feed()
    {
        if (lifePoints <= 0) {
            System.out.println(name + " cannot be fed, they are dead.");
        }
        else {
            lifePoints = lifePoints + 500;
            if (lifePoints > 9999) {
                lifePoints = 9999;
            }
            System.out.println(name + " lifePoints after being fed: " + lifePoints);
        }
    }
    // - - - - - //
    public void shout()
    {
        // begin: random num variables
        int max = 3;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        // end: random num variables
        if (lifePoints > 0) {
            lifePoints = lifePoints - 200;
            if (lifePoints == 0) {
                // random message switch
                System.out.print(name + " shouted: ");
                switch(rand) {
                case 1:
                    System.out.println("Tell me tell me tell me you want me want me want me too- ");
                    break;
                case 2:
                    System.out.println("Your life is as valuable as a summer ant. Your life is nothing, you serve zero purpose. ");
                    break;
                case 3:
                    System.out.println("You already know I'm obssesed with it. *burps* I can't get enough. Back with another milk- ");
                    break;
                }
                //
                System.out.println(name + " shouted to death.");
            } else {
                if (lifePoints < 0) {
                    System.out.println(name + " died.");
                } else {
                    switch(rand) {
                    case 1:
                        System.out.print("Tell me tell me tell me you want me want me want me too- ");
                        break;
                    case 2:
                        System.out.print("Your life is as valuable as a summer ant. Your life is nothing, you serve zero purpose. ");
                        break;
                    case 3:
                        System.out.print("You already know I'm obssesed with it. *burps* I can't get enough. Back with another milk- ");
                        break;
                    }
                    System.out.println(name + " shouted. They now have " + lifePoints + " lifePoints left.");
                }
            }
        }
        else {
            System.out.println(name + " is dead, they cannot shout.");
        }
    }
    // - - - - - //
    public void flex() {
        if (lifePoints > 0) {
            lifePoints = lifePoints - 400;
            if (lifePoints == 0) {
                System.out.println(name + " flexed to death.");
            } else {
                if (lifePoints < 0) {
                    System.out.println(name + " died.");
                } else {
                    System.out.println(name + " flexed. They now have " + lifePoints + " lifePoints left.");
                }
            }
        }
        else {
            System.out.println(name + " is dead, they cannot flex.");
        }
    }
    // - - - - - //
    public void slap() {
        if (lifePoints > 0) {
            lifePoints = lifePoints - 1000;
            if (lifePoints == 0) {
                System.out.println(name + " was slapped to death.");
            } else {
                if (lifePoints < 0) {
                    System.out.println(name + " died.");
                } else {
                    System.out.println(name + " was slapped. They now have " + lifePoints + " lifePoints left.");
                }
            }
        }
        else {
            System.out.println(name + " is dead, they cannot be slapped.");
        }
    }
}
