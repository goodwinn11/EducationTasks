package Task4.Poligon;

public class TextDemo {
    public static void main(String[] args) {
        Text text1 = new Text();
        System.out.println("Ввод текста 1");
        text1.text= "";
        boolean more =true;
         do {
            System.out.println("Хотите ввести еще текст? 1- да, 2- нет: ");
            int choise = Input.getNormInt();
            if (choise ==1) text1.addText();
            else if (choise ==2 ) more =false;
            else System.out.println("Введите 1 или 2");
        }while (more);

        System.out.println("Финальный текст 1 "+  text1.text);

        Text text2 = new Text();
        System.out.println("Ввод текста 2");
        text2.text= "";
        more =true;
        do {
            System.out.println("Хотите ввести еще текст? 1- да, 2- нет: ");
            int choise = Input.getNormInt();
            if (choise ==1) text2.addText();
            else if (choise ==2 ) more =false;
            else System.out.println("Введите 1 или 2");
        }while (more);

        System.out.println("Финальный текст 2 "+  text2.text);
        System.out.println("Хотите объединить тексты? 1- да, 2- нет: ");
        int choise = Input.getNormInt();
        if (choise ==1) {
            text1.text= text1.text.concat(text2.text);
            System.out.println("Финальный текст "+ text1.text);
        }
        else if (choise ==2 ) more =false;
    }
}
