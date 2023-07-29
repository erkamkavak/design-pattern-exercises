import lib.*; 

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            Computer gamingComputer = Director.getGamingComputer(new ComputerBuilder());
            int gamingComputerCost = Director.getGamingComputer(new ComputerValueBuilder());

            Computer officeComputer = Director.getOfficeComputer(new ComputerBuilder());
            int officeComputerCost = Director.getOfficeComputer(new ComputerValueBuilder());
        }
    }
}
