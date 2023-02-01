package adapter;

public class MusicPlayer {

    private String song;

    public MusicPlayer(){ }

    public void playSong (String song) {
        System.out.println("Now you are listening: " + song);
    }

    public void stopSong (String song) {
        System.out.println("Now you are NOT listening: " + song);
    }
}
