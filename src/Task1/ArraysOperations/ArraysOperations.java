package Task1.ArraysOperations;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraysOperations {
    int FirstArray[][];
    int SecondArray[][];
    int SumArray[][];

    public static void main(String[] args) throws IOException {
        boolean first = false, second = false, third = false; // выполнена ли операция арифметическая

        //матрица размеров массивов
        int size[][] = new int[2][2];
        //ввод размеров массивов
        inputSizeofArrays(size);
        //вывод размеров массивов
        System.out.println("Размеры массива");
        printOutArray(size);
        //инициализация массивов
        int[][] array1 = new int[size[0][0]][size[0][1]];
        int[][] array2 = new int[size[1][0]][size[1][1]];
        //ввод элементов массивов
        inputArrayMembers(size, array1, array2);
        //вывод элементов массивов
        System.out.println();
        if (array1.length !=0 || array2.length!=0){
            System.out.println("Массивы");
            printOutArray(array1);
            System.out.println();
            printOutArray(array2);
        }


        boolean work = true; //продолжать вычисления


        int[][] resultArray = new int[size[0][0]][size[0][1]]; //инициализация матрицы под сложение и вычитание
        int[][] multiplicationArray = new int[size[0][0]][size[1][1]];
        int operation = 0;
        while(work){
            try {
                System.out.println("Введите операцию над матрицами: 1- сложение, 2- вычитание, 3-умножение, 4- выход");
                operation = Input.getNormInt();
                }catch (Exception e){
                System.out.println("Необходимо ввести цифру от 1 до 4 ");
                }

                switch (operation) {
                    case 1: { //сложение
                        if (size[0][0] == size[1][0] && size[0][1] == size[1][1]) {
                            for (int i = 0; i <= size[0][0] - 1; i++) {
                                for (int j = 0; j <= size[0][1] - 1; j++) {
                                    resultArray[i][j] = array1[i][j] + array2[i][j];
                                }
                            }
                        first = true;
                            break;
                        } else {
                            System.out.println("Возможно сложение только матриц одинакового размера");

                            break;
                        }

                    }
                    case 2: { //вычитание
                        if (size[0][0] == size[1][0] && size[0][1] == size[1][1]) {
                            for (int i = 0; i <= size[0][0] - 1; i++) {
                                for (int j = 0; j <= size[0][1] - 1; j++) {
                                    resultArray[i][j] = array1[i][j] - array2[i][j];
                                }
                            }
                            second = true;
                            break;

                        } else {
                            System.out.println("Возможно вычитание только для матриц одинакового размера");
                            break;

                        }
                    }
                    case 3: { //умножение
                        if (size[0][1] == size[1][0]) {
                            for (int i = 0; i <= size[0][0] - 1; i++) {
                                for (int j = 0; j <= size[1][1] - 1; j++) {
                                    for (int r = 0; r <= size[0][1] - 1; r++)
                                        multiplicationArray[i][j] += array1[i][r] * array2[r][j];
                                }
                            }
                            third = true;
                            break;
                        } else {
                            System.out.println("Перемножать можно только совместимые матрицы ");
                            break;

                        }
                    }
                    case 4: {
                        work = false; //выход
                        break;
                    }
                    default: {
                        System.out.println("Введен неверный номер операции");
                        break;
                    }
                }


        }
        if(first || second){
            System.out.println("Массив результата сложения/вычитания");
            printOutArray(resultArray);
        }
        if (third){
            System.out.println("Массив результата умножения");
            printOutArray(multiplicationArray);
        }
        if (!first && !second && !third) System.out.println("Никаких операций не произведено");

    }

    private static void inputSizeofArrays(int[][] size) throws IllegalArgumentException{
        for (int i =0; i<=1; i++){
            for(int j= 0; j<=1; j++){
                do {
                    System.out.printf("Введите %d размер %d массива ", j + 1, i + 1);
                    size[i][j]= Input.getNormInt();
                    if (size[i][j] ==0) System.out.println("Величина должна быть больше нуля ");
                }while (size[i][j] <= 0 );
            }
        }
    }

    private static void inputArrayMembers(int[][] size, int[][] array1, int[][] array2) throws IllegalArgumentException{
        for (int matrix =0; matrix <= 1; matrix++){

            for (int i = 0; i <= size[matrix][0]-1; i++) {
                for (int j = 0; j <= size[matrix][1]-1; j++) {
                      try {
                          System.out.printf("Введите элементы %d массива ", matrix + 1);
                          if (matrix == 0) array1[i][j] = Input.getNormInt();
                          else if (matrix == 1) array2[i][j] = Input.getNormInt();
                      } catch (Exception e) {
                          System.out.println("Необходимо ввести число ");
                          inputArrayMembers(size, array1, array2);
                      }
                      }
            }
            System.out.println();
        }
    }

    private static void printOutArray(int[][] size) {
        for (int[] a: size){
            System.out.println(Arrays.toString(a));
        }
    }
}
