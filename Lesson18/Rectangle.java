public class Rectangle extends Figure implements Figure2D {
    private static final String NAME = "Rectangle";
    
    private double width;
    private double length;
    
    public Rectangle() {}
    
    public Rectangle(double length, double width) {
    	this.length = length;
        this.width = width;
    }
    
    public Rectangle(Rectangle ob) {
    	this.length = ob.length;
        this.width = ob.width;
    }
    
    @Override
    public String getName() {
        return NAME;
    }
    
    @Override
    public double getArea() {
    	double area = width * length;
        return area;
    }
}
