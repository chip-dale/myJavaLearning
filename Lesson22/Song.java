public class Song {
    private String name;
    private String artist;
    private Genre genre;

    Song(String artist, String name, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString(){
        return artist + " - " + name + " - " + genre;
    }
}
