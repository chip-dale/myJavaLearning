package task1;

public class Square extends Figure {
    private static final String NAME = "Square";
    
    private double width;
    
    public Square() {}
    
    public Square(double width) {
        this.width = width;
    }
    
    public Square(Square ob) {
    	this.width = ob.width;
    }
    
    @Override
    public String getName() {
        return NAME;
    }
    
    @Override
    public double getArea() {
    	double area = Math.pow(width, 2);
        return area;
    }
    
    @Override
    public double getVolume() {
        return 0;
    }
}
