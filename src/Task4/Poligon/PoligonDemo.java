package Task4.Poligon;

public class PoligonDemo {
    public static void main(String[] args) {
//        Coordinates[] firstCoordinates = new Coordinates[1];
//        Coordinates zero = new Coordinates(0,0);
//        firstCoordinates[0]= new Coordinates(0,0);
//        Poligon firstPoligon = new Poligon(1, firstCoordinates);
//        for (int i = 0; i< firstCoordinates.length; i++){
//            firstCoordinates[i].setCoordinates();
//        }
//        System.out.printf("Координаты первого многоугольника x %d y %2d", firstPoligon.coordinates[0].x, firstPoligon.coordinates[0].y);

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
