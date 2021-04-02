public class Sphere extends Circle implements Figure3D {
	private static final String NAME = "Sphere";
	
	//protected double radius;
    
    public Sphere() {}
	
	public Sphere(Circle ci) {
		super(ci);
		//this.radius = radius;
	}
	
	@Override
    public String getName() {
        return NAME;
    }
    
    @Override
    public double getVolume() {
        double volume = Math.PI * Math.pow(super.getRadius(), 3) * 4 / 3;
        return volume;
    }
}
