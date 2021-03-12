public interface MusicPlayer {
    Song play();
    Song pause();
    Song stop();
    Song next();
    Song previous();
    Song[] searchByGenre(Genre genre);
    Song[] searchByName(String name);

}
