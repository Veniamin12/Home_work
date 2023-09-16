package Home_3;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        cat.doRun(201);
        cat.doSwim(55);
        dog.doRun(50);
        dog.doSwim(12);

        System.out.println("Created objects of class cat: " + Cat.getObjectinstance());
        System.out.println("Created objects of class dog: " + Dog.getObjectInstance());
    }
}
