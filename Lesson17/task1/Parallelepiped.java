package task1;
public class Parallelepiped extends Square {
	private static final String NAME = "Parallelepiped";
    
    private double height;
    
    public Parallelepiped() {}
    
    public Parallelepiped(Square sq, double height) {
    	super(sq);
        this.height = height;
    }
    
    @Override
    public String getName() {
        return NAME;
    }
    
    @Override
    public double getVolume() {
    	double volume = getArea() * height;
        return volume;
    }
}
