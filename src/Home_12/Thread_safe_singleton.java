package Home_12;

public class Thread_safe_singleton {
    private static Thread_safe_singleton instance;

    private Thread_safe_singleton() {
    }

    public static synchronized Thread_safe_singleton getInstance() {
        if (instance == null) {
            instance = new Thread_safe_singleton();
        }
        return instance;
    }
}
