import java.util.ArrayList;
import java.util.*;

public class Playlist {
    private ArrayList<Songs> Tracklist = new ArrayList<Songs>();

    public void addTrack(Songs song) {
        Tracklist.add(song);
    }

    public void addTrack(String title, String artist, String time) {
        Songs newSong = new Songs(title, artist, time);
        Tracklist.add(newSong);
    }

    public int getRuntime() {
        int tracklistRuntime = 0;
        for (int i = 0; i < Tracklist.size(); i++) {
            tracklistRuntime += Tracklist.get(i).getRuntime();
        }
        return tracklistRuntime;
    }

    public String formatTime() {
        int time = getRuntime();
        int h;
        int m;
        int s;
        h = time / 3600;
        m = (time % 3600) / 60;
        s = (time % 60);
        if (h == 0) {
            return m + " minutes " + s + " seconds";
        } else if (h == 0 && m == 0) {
            return s + " seconds";
        } else {
            return "" + h + " hours " + m + " minutes " + s + " seconds";
        }
    }

    public void print() {
        for (int i = 0; i < Tracklist.size(); i++) {
            System.out.println("" + (i + 1) + ". " + Tracklist.get(i).getTitle() + ", " + Tracklist.get(i).getArtist()
                    + " - " + Tracklist.get(i).formatTime());
        }
    }

    public void sort() {
        Collections.sort(Tracklist);
    }

    // public void sort(String pref){
    // Collections.sort(Tracklist);
    // }
}
