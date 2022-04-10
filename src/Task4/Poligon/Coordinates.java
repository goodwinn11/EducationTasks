package Task4.Poligon;



public class Coordinates {
    int x;
    int y;


    public void setCoordinates(int i){

            System.out.printf("Введите координату х точки %d ", i);
            x = Input.getNormInt();
            System.out.printf("Введите координату у точки %d ", i);
            y= Input.getNormInt();

    }

}
