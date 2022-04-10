package Task4.Poligon;

public class Triangle extends Poligon{

    public Triangle(int edges, Coordinates[] coordinates) {
        super(edges, coordinates);
        edges =3;
    }
    public void setCoordinates(){
        for (int i =0; i<3; i++){
            coordinates[i].setCoordinates(i+1);
        }
    }
    public void printCoordinates(){
        for (int i =0; i<3; i++){
            System.out.printf("\nКоордината точки  %d (x,y): (%d,%d) ", i+1, coordinates[i].x, coordinates[i].y);
        }
    }
}
