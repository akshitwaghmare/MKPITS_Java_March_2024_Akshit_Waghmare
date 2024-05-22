package PlaylistManager;

public class Playlist {
    private int songID;
    private String title;
    private String artist;

    public Playlist(int songID, String title, String artist) {
        this.songID = this.songID;
        this.artist = this.artist;
        this.title = this.title;
    }

    public int getSongID() {
        return songID;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "songID=" + songID +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
