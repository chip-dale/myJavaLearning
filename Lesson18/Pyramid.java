public class Pyramid extends Triangle implements Figure3D {
	private static final String NAME = "Pyramid";
	
	protected double height;
	
    public Pyramid() {}
	
    public Pyramid(Triangle tr, double height) {
    	super(tr);
		this.height = height;
	}
    
    @Override
    public String getName() {
        return NAME;
    }
    
    @Override
    public double getVolume() {
        double volume = getArea() * height / 3;
        return volume;
    }
}
