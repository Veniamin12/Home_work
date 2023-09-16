package Home_3;

public class Cat extends Animals {
    private static int objectInstance = 0;

    public Cat() {
        objectInstance++;
    }

    public static int getObjectinstance() {
        return objectInstance;
    }

    @Override
    public void doRun(int distance) {
        if (distance <= 200) {
            System.out.println("The cat ran: " + distance);
        } else {
            System.out.println("The cat doesnt runs that much!");
        }
    }

    @Override
    public void doSwim(int distance) {
        System.out.println("The cats cant swim!");
    }
}
