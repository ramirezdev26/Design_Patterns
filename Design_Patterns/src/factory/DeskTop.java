package factory;

public class DeskTop implements Computer {

    @Override
    public void buy() {
        System.out.println("Buying a DeskTop");
    }
}
