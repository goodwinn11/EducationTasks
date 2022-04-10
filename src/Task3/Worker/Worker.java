package Task3.Worker;
/*
Создать классы для описания работников: работник в общем, бухгалтер,
главный бухгалтер, инженер, рабочий. Все имеют имя, должность и зарплату.
Добавить характерные для каждого класса в отдельности методы.
Переопределить все доступные методы класса Object адекватным образом.
Создать массив, содержащий объекты всех классов описания работников,
и вывести его на консоль.

 */
public class Worker {
    String name;
    String position;
    double salary;

    public Worker(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        salary *= (1 +percent/100);
    }
    public void decreaseSalary(double percent){
        salary *= (1 - percent/100);
    }
    public void results(){
        System.out.println(name + " превысил KPI на 10 процентов");
    }
}
