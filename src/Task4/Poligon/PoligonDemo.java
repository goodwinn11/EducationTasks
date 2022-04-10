package Task4.Poligon;

public class PoligonDemo {
    public static void main(String[] args) {

        Coordinates zeroCoordinatesArray[] = new Coordinates[3];
        zeroCoordinatesArray[0] = new Coordinates();
        zeroCoordinatesArray[1] = new Coordinates();
        zeroCoordinatesArray[2] = new Coordinates();
        System.out.println("Введите координаты первого треугольника ");
        Triangle first = new Triangle(3, zeroCoordinatesArray);
        first.setCoordinates();
        System.out.println("Координаты первого треугольника ");
        first.printCoordinates();





    }

}
