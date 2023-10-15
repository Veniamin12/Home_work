package Home_12;

public class Eager_Singleton {
    private static Eager_Singleton eager_singleton = new Eager_Singleton();

    private Eager_Singleton() {

    }

    public static Eager_Singleton getInstance() {
        return eager_singleton;
    }
}

