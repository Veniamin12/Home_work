package Home_8;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Circle(10),
                new Square(55),
                new Triangle(3, 6, 8),
        };
        System.out.println(figures[0].calcArea());
        System.out.println(figures[1].calcArea());
        System.out.println(figures[2].calcArea());

        Calculator calculator = new Calculator();
        System.out.println(calculator.calcTotalArea(figures));

    }
}
