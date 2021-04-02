public class Triangle extends Figure implements Figure2D {
    private static final String NAME = "Triangle";
    
    private double sideA;
    private double sideB;
    private double sideC;
    
    public Triangle() {}

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public Triangle(Triangle ob) {
    	this.sideA = ob.sideA;
        this.sideB = ob.sideB;
        this.sideC = ob.sideC;
    }
    
    @Override
    public String getName() {
        return NAME;
    }
    
    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2; // полупериметр треугольника
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формуга Герона
        return area;    
    }
    
    public double getVolume() {
    	return 0;
    }
}