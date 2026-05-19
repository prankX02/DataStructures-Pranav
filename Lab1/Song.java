package Lab1;

public class Song {
    private String artist;
    private String title;
    private String album;

    public Song(String artist, String title, String album){
        this.artist = artist;
        this.title = title;
        this.album = album;
    }

    public String toString() {
        return "Song "+title+" by "+artist+ ", in the album "+album;
    }
}
