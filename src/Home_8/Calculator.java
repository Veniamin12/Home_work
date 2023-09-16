package Home_8;

public class Calculator implements Total_Area{
    @Override
    public double calcTotalArea(Figure[] figures) {
        double totalArea =0;
        for(Figure figure: figures){
            totalArea+=figure.calcArea();
        }
        return totalArea;
    }
}
