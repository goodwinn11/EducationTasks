package Task4.Poligon;

/*
Создать класс для описания многоугольников в общем и треугольника в частности.
Также создать класс для описания текста. Все классы должны иметь метод вывода на экран.
Создать отдельный класс для операций над объектами. В классе должен быть метод вывода массива объектов на экран.
Все объекты задавать в исходном коде (не меньше 3-х различных треугольников и двух текстов).
 */
public class Poligon {
    int edges;
    Coordinates coordinates[];

    public Poligon(int edges, Coordinates[] coordinates) {
        this.edges = edges;
        this.coordinates = coordinates;
    }
}
