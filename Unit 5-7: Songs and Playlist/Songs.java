public class Songs implements Comparable<Songs> {
    private String songTitle;
    private String songArtist;
    private String songTime;
    private int runtime;

    public Songs(String title, String artist, String time) {
        songTitle = title;
        songArtist = artist;
        songTime = time; 
    }

    @Override
    public int compareTo(Songs s) {
        return this.songTitle.compareTo(s.getTitle());
    }

    public String getTitle() {
        return songTitle;
    }

    public String getArtist() {
        return songArtist;
    }

    public int getTime() {
        return this.calcRuntime(songTime);
    }
    
    public String formatTime() {
        this.calcRuntime(songTime);
        int time = runtime;
        int h; int m; int s;
        h = time/3600;
        m = (time%3600) / 60;
        s = (time%60);
        if (h == 0 && m == 0) {
            return s + " seconds";
        } else if (h == 0) {
            return  m + " minutes " + s + " seconds";
        } else {
            return "" + h + " hours " + m + " minutes " + s + " seconds";
        }
    }

    private int calcRuntime(String time) {
        String[] splitTime = time.split(":");
        runtime = 0;
        for (int i = 0; i < splitTime.length; i++) {
            // +5 "Songs Elegant calcRuntime *BONUS"
            runtime += (Integer.parseInt(splitTime[splitTime.length - 1 - i])) * (int) Math.pow(60, i);
        }
        return runtime;
    }
}
