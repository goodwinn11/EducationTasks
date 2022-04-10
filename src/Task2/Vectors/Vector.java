package Task2.Vectors;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Vector extends Main {
    public double x,y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public Vector inputVectorCoordinates(int number){
        Scanner in = new Scanner(System.in);
        Vector filledVector = new Vector(0,0);
        System.out.printf("Введите координату х %d вектора: ", number + 1);
        filledVector.x= Input.getNormDouble();
        System.out.printf("Введите координату y %d вектора: ", number + 1);
        filledVector.y= Input.getNormDouble();
        return filledVector;
    }

    public void printOutVector(){
        System.out.printf("Координата вектора x: %.2f Координата вектора y: %.2f", this.x, this.y);
    }
    public Vector additionVector(Vector vector2){
        Vector resultVector = new Vector(0,0);
        resultVector.x = this.x + vector2.x;
        resultVector.y = this.y + vector2.y;
        return resultVector;
    }

    public Vector devisionVector(double scalar) {

        Vector resultVector = new Vector(0,0);

            resultVector.x = this.x / scalar;
            resultVector.y = this.y / scalar;

        return resultVector;
    }

    public Vector multiplicationVector(double scalar) {

        Vector resultVector = new Vector(0,0);
        resultVector.x = this.x * scalar;
        resultVector.y = this.y * scalar;
        return resultVector;
    }

    public static Vector subtractionVectors(Vector vector1, Vector vector2) {
    Vector resultVector = new Vector(0,0);
    resultVector.x = vector1.x - vector2.x;
    resultVector.y = vector1.y - vector2.y;
    return resultVector;
    }
}

