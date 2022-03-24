package Task2.Vectors;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public Vector[] vectors;

    public static void main(String[] args) {
        Vector[] vectors = new Vector[2];
        vectors[0] = new Vector(0, 0);
        vectors[1] = new Vector(0, 0);
        vectors[0]=vectors[0].inputVector(0);
        vectors[1]=vectors[1].inputVector(1);
        vectors[0].printOutVector();
        System.out.println();
        vectors[1].printOutVector();
        //запрос операции с векторами
        boolean work = true;
        Vector[] resultVector = new Vector[6];
        resultVector[1] = new Vector(0, 0);
        Scanner in = new Scanner(System.in);
        int operation = 0;
        boolean op1, op2, op3, op4;
        op1 = op2 = op3 = op3 = op4 = false;


        while (work) {
            try {
                System.out.println("\nВведите операцию над векторами: 1- сложение, 2- вычитание, 3-умножение на скаляр, 4 - деление на скаляр 5- выход");
                operation = in.nextInt();
            } catch (Exception e) {
                System.out.println("Необходимо ввести цифру от 1 до 4 ");
            }

            switch (operation) {
                case 1: {  //сложение
                    resultVector[1] = vectors[0].additionVector(vectors[1]);
                    op1 = true;
                    break;
                }
                case 2: { //вычитание
                    resultVector[2] = Vector.subtractionVectors(vectors[0], vectors[1]);
                    op2 = true;
                    break;
                }

                case 3: { //умножение
                    System.out.print("Введите скаляр для вектора 1: ");
                    double scalar = inputNormDouble(in);
                    resultVector[0] = vectors[0].multiplicationVector(scalar);
                    System.out.print("Введите скаляр для вектора 2: ");
                    resultVector[3] = vectors[1].multiplicationVector(scalar);
                    op3 = true;
                    break;


                }
                case 4: { //деление
                    System.out.print("Введите скаляр для вектора 1: ");

                    double scalar = inputNormDouble(in);
                    if (scalar != 0) resultVector[4] = vectors[0].devisionVector(scalar); else System.out.println("Деление на ноль невозможно");
                    System.out.print("Введите скаляр для вектора 2: ");
                    scalar = inputNormDouble(in);
                    if (scalar != 0) resultVector[5] = vectors[1].devisionVector(scalar); else System.out.println("Деление на ноль невозможно");
                    op4 = true;
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
        if (op1) {
            System.out.println("\n\nВектор сложения ");
            resultVector[1].printOutVector();
        }
        if (op2) {
            System.out.println("\n\nВектор вычитания ");
            resultVector[2].printOutVector();
        }
        if (op3) {
            System.out.println("\n\nВектор 1 после умножения на скаляр ");
            resultVector[0].printOutVector();

        System.out.println("\n\nВектор 2 после умножения на скаляр ");
        resultVector[3].printOutVector();
        }
        if (op4) {

            System.out.println("\n\nВектор 1 после деления на скаляр ");
            resultVector[4].printOutVector();
            System.out.println("\n\nВектор 2 после деления на скаляр ");
            resultVector[5].printOutVector();
        }

    }
public static double inputNormDouble(Scanner in){
        double normDouble = 0;
        boolean norm = false;

        do{
            try{
                normDouble = in.nextDouble();
                norm = true;
            } catch (InputMismatchException e){
                System.out.print("Необходимо ввести число: ");
                in.skip(".*\n");
            }

        }while (!norm);
        return normDouble;
}
}
