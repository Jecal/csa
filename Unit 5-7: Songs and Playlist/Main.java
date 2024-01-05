import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Songs drunker = new Songs("drunker", "Fennel", "4:34");
        Songs dreaming = new Songs("dreaming", "Fennel", "3:43");
        Songs Sunday = new Songs("Sunday", "Fennel", "3:37");
        
        /*
         * System.out.println(dreaming.getTitle());
         * System.out.println(Sunday.getArtist());
         * System.out.println(drunker.getRuntime());
         */

        /*
         * System.out.println(drunker.getRuntime() + dreaming.getRuntime() +
         * Sunday.getRuntime());
         */

        Playlist slowDown = new Playlist();
        slowDown.addTrack(drunker);
        slowDown.addTrack(dreaming);
        slowDown.addTrack(Sunday);
        // System.out.println(slowDown.getRuntime());
        slowDown.sort();
        slowDown.print();
        System.out.println(slowDown.formatTime());
    }
}
