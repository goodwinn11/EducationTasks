package Task4.Poligon;

public class PoligonDemo {
    public static void main(String[] args) {

//        Coordinates zeroCoordinatesArray[] = new Coordinates[3];
//        zeroCoordinatesArray[0] = new Coordinates();
//        zeroCoordinatesArray[1] = new Coordinates();
//        zeroCoordinatesArray[2] = new Coordinates();
        Coordinates[] zeroCoordinatesArray = zeroArray();
        System.out.println("Введите координаты первого треугольника ");
        Triangle first = new Triangle(3, zeroCoordinatesArray);
        first.setCoordinates();
        System.out.println("Координаты первого треугольника ");
        first.printCoordinates();
        zeroCoordinatesArray = zeroArray();
        System.out.println("\nВведите координаты второго треугольника ");
        Triangle second = new Triangle(3,zeroCoordinatesArray);
        second.setCoordinates();
        System.out.println("\nКоординаты второго треугольника ");
        second.printCoordinates();
        zeroCoordinatesArray = zeroArray();
        System.out.println("\nВведите координаты третьего треугольника ");
        Triangle third = new Triangle(3,zeroCoordinatesArray);
        third.setCoordinates();
        System.out.println("\nКоординаты третьего треугольника ");
        third.printCoordinates();
        System.out.println("\nНа какую величину по х сместить третий треугольник ");
        third.shiftTriangle(Input.getNormInt());
        System.out.println("\nКоординаты третьего треугольника после смещения");
        third.printCoordinates();
        Triangle[] triangles = new Triangle[3];
        triangles[0]= first;
        triangles[1]= second;
        triangles[2]= third;
        System.out.println("\n\nКоординаты всех треугольников");
        for (int i =0; i< triangles.length; i++){
            System.out.printf("\nКоординаты %d тругольника", i+1);
            triangles[i].printCoordinates();
        }


    }
    public static Coordinates[] zeroArray (){
        Coordinates zeroCoordinatesArray[] = new Coordinates[3];
        zeroCoordinatesArray[0] = new Coordinates();
        zeroCoordinatesArray[1] = new Coordinates();
        zeroCoordinatesArray[2] = new Coordinates();
        return zeroCoordinatesArray;
    }
}
