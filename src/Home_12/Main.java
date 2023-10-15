package Home_12;

public class Main {
    public static void main(String[] args) {
        //1-st variant
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
        System.out.println( " ");

        //2-nd variant
        Eager_Singleton eager_singleton = Eager_Singleton.getInstance();
        Eager_Singleton eager_singleton1 = Eager_Singleton.getInstance();
        System.out.println(eager_singleton.hashCode());
        System.out.println(eager_singleton1.hashCode());
        System.out.println(" ");

        //3-rd variant - thread safe
        Thread_safe_singleton thread_safe_singleton =Thread_safe_singleton.getInstance();
        Thread_safe_singleton thread_safe_singleton1 =Thread_safe_singleton.getInstance();
        System.out.println(thread_safe_singleton1.hashCode());
        System.out.println(thread_safe_singleton.hashCode());
    }
}
