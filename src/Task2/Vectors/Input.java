package Task2.Vectors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static double getNormDouble(){
        double d;
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                d = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.print("Ошибка, введите дробное число ");
            }
        }
    return d;
    }
    public static int getNormInt(){
        int i;
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                i = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.print("Ошибка, введите целое число ");
            }
        }
        return i;
    }

}
