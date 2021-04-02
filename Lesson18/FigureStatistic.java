public class FigureStatistic {
	static double averageArea(Figure2D... f2d) {
		double sum = 0;
		for(Figure2D i : f2d) {
            sum += i.getArea();
        }
		double average = sum / f2d.length;
		return average;
	}
	static double averageVolume(Figure3D... f3d) {
		double sum = 0;
		for(Figure3D j : f3d) {
            sum += j.getVolume();
        }
		double average = sum / f3d.length;
		return average;
	}
}
