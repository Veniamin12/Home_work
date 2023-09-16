package Home_3;

public class Dog extends Animals {
    private static int objectInstance = 0;

    public Dog() {
        objectInstance++;
    }

    public static int getObjectInstance() {
        return objectInstance;
    }

    @Override
    public void doRun(int distance) {
        if (distance <= 500) {
            System.out.println("The Dog ran: " + distance + ".");
        } else {
            System.out.println("The dog doesnt runs that much!");
        }
    }

    @Override
    public void doSwim(int distance) {
        if (distance <= 10) {
            System.out.println("The dog swam: " + distance + ".");
        } else {
            System.out.println("The dog doesnt swim that much!");
        }

    }
}
