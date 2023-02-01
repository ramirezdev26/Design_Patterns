package factory;

public abstract class ComputerFactory {

    public static Computer getComputer(String computerType) {
        if (computerType.equals("Laptop")) {
            return new LapTop();
        } else if (computerType.equals("Desktop")) {
            return new DeskTop();
        } else if (computerType.equals("Workstation")) {
            return new WorkStation();
        } else {
            return null;
        }
    }

}
