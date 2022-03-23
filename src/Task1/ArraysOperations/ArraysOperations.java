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
//        System.out.print("Введите первый размер первого массива ");
       var in = new Scanner(System.in);
//        int size = in.nextInt();
//        System.out.print("Введите второй размер первого массива ");
//        int size2 = in.nextInt();
//        System.out.printf("Размер первого массива %d на %d", size, size2);
        int size[][] = new int[2][2];
        for (int i =0; i<=1; i++){
            for(int j= 0; j<=1; j++){
                System.out.printf("Введите %d размер %d массива ", j+1, i+1);
                size[i][j] = in.nextInt();
            }
        }
        System.out.println("Размеры массива");
        for (int[] a: size){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
    }
}
