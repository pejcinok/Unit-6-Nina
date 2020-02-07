public class Album {
    private double playTime;
    private String title;
    private String artist;
    private int trackNumber;

    public Album(String theTitle, String theArtist, int theTrackNumber, double thePlayTime){
        title = theTitle;
        artist = theArtist;
        trackNumber = theTrackNumber;
        playTime = thePlayTime;
    }
    public double getPlayTime(){
        return playTime;
    }

    public String toString(){
        String result = "";
        result += title + " by: " + artist + ", # of songs: " + trackNumber + " runtime: " + playTime;
        return result;
    }


}
