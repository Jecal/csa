import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Songs infinite = new Songs("infinitesimal", "ivri", "2:42");
        Songs nowayout = new Songs("no way out", "ivri", "1:53");
        Songs sry = new Songs("Sorry for my late reply", "MEMI", "3:31");
        Songs rain = new Songs("雨、キミを連れて", "EGOIST", "4:15");
        
        Playlist noimgood = new Playlist();
        noimgood.addTrack(infinite);
        noimgood.addTrack(nowayout);
        noimgood.addTrack("I'm Just Like That", "YONLAPA",  "3:27");
        noimgood.addTrack(rain);
        
        noimgood.sort();
        noimgood.print();
        
        System.out.println(Playlist.formatTime(noimgood.getRuntime()));
        
        /*
        System.out.println("//////////////////////////");
        */
        
        /*
        Playlist mySongs = new Playlist();
        Songs Alive = new Songs ("Alive 2007 Concert", "Daft Punk", "1:24:06");
        Songs eden = new Songs ("In-A-Gadda-Da-Vida", "Iron Butterfly", "17:03");
        mySongs.addTrack(eden);
        mySongs.addTrack("Hard Times", "The Jetzons", "172");
        mySongs.addTrack("Harder Better Faster Stronger", "Daft Punk", "3:42");
        mySongs.addTrack("Harder Better Faster Stronger", "Pomplamoose", "4:21");
        mySongs.addTrack("Hikari", "Utada Hikaru", "4:01");
        mySongs.addTrack(Alive);
        mySongs.print();
        System.out.println(Playlist.formatTime(mySongs.getRuntime()));
        */
    }
}
