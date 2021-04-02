public class Parallelepiped extends Rectangle implements Figure3D {
	private static final String NAME = "Parallelepiped";
    
    private double height;
    
    public Parallelepiped() {}
    
    public Parallelepiped(Rectangle re, double height) {
    	super(re);
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
