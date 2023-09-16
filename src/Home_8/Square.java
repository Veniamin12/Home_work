package Home_8;

public class Square implements Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calcArea() {
        return a * a;
    }
}
