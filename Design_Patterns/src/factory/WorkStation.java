package factory;

public class WorkStation implements Computer {
    @Override
    public void buy() {
        System.out.println("Buying a WorkStation");
    }
}
