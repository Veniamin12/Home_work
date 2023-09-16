package Home_8;

public class Circle implements Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calcArea() {
        return Math.PI * r * r;
    }
}
