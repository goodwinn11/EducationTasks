package Task1.ArraysOperations;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysOperations {
    int FirstArray[][];
    int SecondArray[][];
    int SumArray[][];

    public static void main(String[] args) throws IOException {

       var in = new Scanner(System.in);
        //матрица размеров массивов
        int size[][] = new int[2][2];
        //ввод размеров массивов
        for (int i =0; i<=1; i++){
            for(int j= 0; j<=1; j++){
                System.out.printf("Введите %d размер %d массива ", j+1, i+1);
                size[i][j] = in.nextInt();
            }
        }
        //вывод размеров массивов
        System.out.println("Размеры массива");
        for (int[] a: size){
            System.out.println(Arrays.toString(a));
        }
        //инициализация массивов
        int[][] array1 = new int[size[0][0]][size[0][1]];
        int[][] array2 = new int[size[1][0]][size[1][1]];
        //ввод элементов массивов
        for (int matrix =0; matrix <= 1; matrix++){
            System.out.printf("Введите элементы %d массива ", matrix + 1);
            for (int i = 0; i <= size[matrix][0]-1; i++) {
                for (int j = 0; j <= size[matrix][1]-1; j++) {
                    if (matrix == 0) array1[i][j] = in.nextInt();
                    else if (matrix == 1) array2[i][j] = in.nextInt();
                }
            }
        }
        //вывод элементов массивов
        System.out.println("Массивы");
        for(int[] b : array1)
            System.out.println(Arrays.toString(b));
        System.out.println();
        for(int[] b : array2)
            System.out.println(Arrays.toString(b));
    }
}
