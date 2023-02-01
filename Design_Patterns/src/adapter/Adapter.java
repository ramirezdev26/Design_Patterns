package adapter;

import java.util.List;

public class Adapter {

    private String initialSong;
    private List<String> playlistToUse;

    public MusicPlayer musicPlayer = new MusicPlayer();
    public PlayList playList = new PlayList();

    public Adapter (String initialSong, List<String> playlistToUse){
        this.initialSong = initialSong;
        this.playlistToUse = playlistToUse;
    }

    public void play(){
        musicPlayer.playSong(initialSong);
    }

    public void next (){
        String nextSong = playList.nextSong(playlistToUse);
        musicPlayer.playSong(nextSong);
        this.initialSong = nextSong;
    }

    public void previous (){
        String previousSong = playList.previousSong(playlistToUse);
        musicPlayer.playSong(previousSong);
        this.initialSong = previousSong;
    }

    public void stop(){
        musicPlayer.stopSong(initialSong);
    }

}
