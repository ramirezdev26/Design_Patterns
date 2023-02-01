package singleton;

public final class GameManager {

    private static GameManager instance;
    public String msg;
    private GameManager(String msg){
        this.msg = msg;
    }

    public static GameManager getInstance(String msg){
        if(instance == null){
            instance = new GameManager(msg);
        }
        return instance;
    }

    public void updateGameState(){
        System.out.println(this.msg);
    }

    public void addGame(){
        System.out.println(this.msg);
    }

    public void removeGame(){
        System.out.println(this.msg);
    }

}
