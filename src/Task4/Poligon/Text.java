package Task4.Poligon;

import java.util.Scanner;

public class Text {
String text;
public void addText(){
    System.out.println("Введите дополнительный текст ");
    Scanner in = new Scanner(System.in);
    String additionalText = in.nextLine();
    text = text.concat(additionalText);
}
}
