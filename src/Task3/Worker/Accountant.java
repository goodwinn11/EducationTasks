package Task3.Worker;

public class Accountant extends Worker{

    public Accountant(String name, String position, int salary) {
        super(name, position, salary);
    }
    public void countSomething(){
        System.out.println("Все уже посчитано у "+name);
    }
    public void quarterlyReport(){
        System.out.println("Квартальный отчет будет готов к среде /" + name);
    }
    public void balance(){
        System.out.println("Баланс пока не сошелся у " + name);
    }
}
