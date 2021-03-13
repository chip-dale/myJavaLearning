import java.lang.*;

public class Player implements MusicPlayer {
    private Song[] list;
    private int i;

    Player(Song[] list, int i) {
        this.i = i;
        this.list = list;
    }

    @Override
    public Song play() {
        return list[i];
    }

    @Override
    public Song pause() {
        return list[i];
    }

    @Override
    public Song stop() {
        return list[i];
    }

    @Override
    public Song next() {
        return list[++i];
    }

    @Override
    public Song previous() {
        return list[--i];
    }

    @Override
    public Song[] searchByGenre(Genre genre) {
        // КОТ НЕ СУЩЕСТВУЕТ (=^..^=)
        return list;
    }

    @Override
    public Song[] searchByName(String name) {
        // КОТ НЕ СУЩЕСТВУЕТ (=^..^=)
        return new Song[0];
    }
}
