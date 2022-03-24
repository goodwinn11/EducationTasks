package Task2.Vectors;
import java.util.Scanner;
import java.util.Vector;



public class Vectors {
    public double x,y;
    public Vectors[] vectors;

    public Vectors(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static void inputVector(int number, Vectors[] vectors){
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите координату х %d вектора: ", number + 1);
        vectors[number].x = in.nextDouble();
        System.out.printf("Введите координату y %d вектора: ", number + 1);
        vectors[number].y = in.nextDouble();
    }

    public static void printOutVector(Vectors[] vectors, int number){
        System.out.printf("Координата вектора x: %.2f Координата вектора y: %.2f", vectors[number].x, vectors[number].y);
    };
    public static Vectors additionVectors(Vectors vector1, Vectors vector2){
        Vectors resultVector = new Vectors(0,0);
        resultVector.x = vector1.x + vector2.x;
        resultVector.y = vector1.y + vector2.y;
        return resultVector;
    }
    public static void main(String[] args) {
        Vectors[] vectors = new Vectors[2];
        vectors[0] = new Vectors(0,0);
        vectors[1] = new Vectors(0,0);
        inputVector(0,vectors);
        inputVector(1,vectors);
        printOutVector(vectors, 0);
        System.out.println();
        printOutVector(vectors, 1);
        //запрос операции с векторами
        boolean work = true;
        Vectors[] resultVector = new Vectors[6];
        resultVector[1]= new Vectors(0,0);
        Scanner in = new Scanner(System.in);
        int operation =0;
        while(work){
            try {
                System.out.println("\nВведите операцию над векторами: 1- сложение, 2- вычитание, 3-умножение на скаляр, 4 - деление на скаляр 5- выход");
                operation = in.nextInt();
            }catch (Exception e){
                System.out.println("Необходимо ввести цифру от 1 до 4 ");
            }

            switch (operation) {
                case 1: {  //сложение
                    resultVector[1] = additionVectors(vectors[0],vectors[1]);
                    break;
                }
                case 2: { //вычитание
                    resultVector[2] = subtractionVectors(vectors[0], vectors[1]);
                    break;
                    }

                case 3: { //умножение
                    System.out.print("Введите скаляр для вектора 1: ");
                    resultVector[0] = multiplicationVector(vectors[0]);
                    System.out.print("Введите скаляр для вектора 2: ");
                    resultVector[3]= multiplicationVector(vectors[1]);

                        break;


                }
                case 4: { //деление
                    System.out.print("Введите скаляр для вектора 1: ");
                    resultVector[4] = devisionVector(vectors[0]);
                    System.out.print("Введите скаляр для вектора 2: ");
                    resultVector[5]= devisionVector(vectors[1]);

                    break;


                }

                case 5: {
                    work = false; //выход
                    break;
                }
                default: {
                    System.out.println("Введен неверный номер операции");
                    break;
                }
            }


        }
        System.out.println("\n\nВектор сложения ");
        printOutVector(resultVector, 1);
        System.out.println("\n\nВектор вычитания ");
        printOutVector(resultVector, 2);
        System.out.println("\n\nВектор 1 после умножения на скаляр ");
        printOutVector(resultVector, 0);
        System.out.println("\n\nВектор 2 после умножения на скаляр ");
        printOutVector(resultVector, 3);
        System.out.println("\n\nВектор 1 после деления на скаляр ");
        printOutVector(resultVector, 4);
        System.out.println("\n\nВектор 2 после деления на скаляр ");
        printOutVector(resultVector, 5);
    }

    private static Vectors devisionVector(Vectors vectors1) {
        Scanner in = new Scanner(System.in);
        double scalar = in.nextDouble();
        Vectors resultVector = new Vectors(0,0);
        if (scalar !=0) resultVector.x = vectors1.x / scalar; else System.out.println("Деление на ноль невозможно");
        if (scalar !=0) resultVector.y = vectors1.y / scalar; else System.out.println("Деление на ноль невозможно");
        return resultVector;
    }

    private static Vectors multiplicationVector(Vectors vectors1) {

        Scanner in = new Scanner(System.in);
        double scalar = in.nextDouble();
        Vectors resultVector = new Vectors(0,0);
        resultVector.x = vectors1.x * scalar;
        resultVector.y = vectors1.y * scalar;
        return resultVector;
    }

    private static Vectors subtractionVectors(Vectors vector1, Vectors vector2) {
    Vectors resultVector = new Vectors(0,0);
    resultVector.x = vector1.x - vector2.x;
    resultVector.y = vector1.y - vector2.y;
    return resultVector;
    }
}

