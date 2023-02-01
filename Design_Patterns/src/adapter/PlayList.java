package adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayList {

    private List<String> playList;
    private int index = 0;

    public PlayList (){ }

    public List<String> getPlayList() {
        return playList;
    }
    public void setPlayList(List<String> playList) {
        this.playList = playList;
    }

    public String nextSong (List<String> playList){
        String song = playList.get(index);
        index++;
        return song;
    }

    public String previousSong (List<String> playList){
        if (index == 0) {
            return playList.get(0);
        } else {
            index--;
            index--;
            return playList.get(index);
        }
    }
}
