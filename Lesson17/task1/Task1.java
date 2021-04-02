package task1;

/**
 * Написать иерархию:
 * Класс Фигура с методами area и volume.
 * Класс треугольник, круг, квадрат  extends от Figure.
 * Класс пирамида, сфера, параллелепипед extends от соответствующих верхних фигур.
 * Переопределить соответствующие методы.
 */
public class Task1 {
	public static void main(String[] args) {
		Triangle tri = new Triangle(5, 8, 5);
		Circle cir = new Circle(10);
		Square squ = new Square(12);
		Pyramid pyr = new Pyramid(tri,6);
		Sphere sph = new Sphere(cir);
		Parallelepiped par = new Parallelepiped(squ,4.4);
		
        Figure[] figure1 = {tri,cir,squ};
        Figure[] figure2 = {pyr,sph,par};
        
        for(Figure i : figure1) {
            //System.out.println(i.getName() + ": area = " + i.getArea() + " sq.m");
        	System.out.printf("%15s: area   = %10.2f sq.m\n",i.getName(),i.getArea());
        }
        for(Figure j : figure2) {
        	//System.out.println(j.getName() + ": volume = " + j.getVolume() + " cub.m");
        	System.out.printf("%15s: volume = %10.2f cub.m\n",j.getName(),j.getVolume());
        }
    }
}
