public class Car {

    private static void startElectricity(){
        System.out.println("Electricity is start!");
    }
    private static void startCommand(){
        System.out.println("Command is start!");
    }
    private static void startFuelSystem(){
        System.out.println("Fuel system is start!");
    }
    public static void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
}
