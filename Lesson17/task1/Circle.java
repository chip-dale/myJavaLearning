package task1;
public class Circle extends Figure {
    private static final String NAME = "Circle";
    
    private double radius;
    
    public Circle() {}
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(Circle ob) {
    	this.radius = ob.radius;
    }
    
    @Override
    public String getName() {
        return NAME;
    }
    
    public double getRadius() {
        return radius;
    }
    
    @Override
    public double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    @Override
    public double getVolume() {
        return 0;
    }
}