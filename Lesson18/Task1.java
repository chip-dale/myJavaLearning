/**
 * Создать абстрактынй класс Figure.
 * Унаследовать от него 3 класса: круг, прямоугольник, треугольник.
 * От унаследованных классов унаследовать: сферу, паралелепипед, пирамиду.
 * Создать интерфейсы и имплементировать их:
 * один для 2D плоскости с площадью, второй для 3D фигур с объемом.
 * Создать класс FigureStatistic со статическими методами: averageArea и averageVolume.
 * Методы должны уметь принимать множество ссылок типа интерфейсов.
 */
public class Task1 {
	public static void main(String[] args) {
		Circle cir = new Circle(10);
		Rectangle rec = new Rectangle(12, 7);
		Triangle tri = new Triangle(5, 8, 5);
		
		Sphere sph = new Sphere(cir);
		Parallelepiped par = new Parallelepiped(rec,4.4);
		Pyramid pyr = new Pyramid(tri,6);
		
        Figure[] figure1 = {cir,rec,tri};
        Figure[] figure2 = {sph,par,pyr};
        
        for(Figure i : figure1) {
            System.out.printf("%15s: area\t= %10.2f sq.m\n",i.getName(),((Figure2D) i).getArea());
        }
        System.out.printf("\t\tAVERAGE\t= %10.2f\n\n", FigureStatistic.averageArea(cir, rec, tri));
        
        for(Figure j : figure2) {
        	System.out.printf("%15s: volume\t= %10.2f cub.m\n",j.getName(),((Figure3D) j).getVolume());
        }
        System.out.printf("\t\tAVERAGE\t= %10.2f\n\n", FigureStatistic.averageVolume(sph, par, pyr));
    }
}
