package Task3.Worker;
/*
Создать классы для описания работников: работник в общем, бухгалтер,
главный бухгалтер, инженер, рабочий. Все имеют имя, должность и зарплату.
Добавить характерные для каждого класса в отдельности методы.
Переопределить все доступные методы класса Object адекватным образом.
Создать массив, содержащий объекты всех классов описания работников,
и вывести его на консоль.

 */
public class WorkerDemo {
    public static void main(String[] args) {
        Accountant accountantHead = new Accountant("Larisa","Head of Department",120_000);
        Accountant accountant = new Accountant("Svetlana","Accountant",80_000);
        Engineer engineer = new Engineer("Ivan", "Senior Engineer", 90_000);
        Worker worker = new Worker("Petr", "Worker", 50_000);
        worker.increaseSalary(10);
        accountant.countSomething();
        accountant.balance();
        accountant.decreaseSalary(10);
        System.out.printf("\nЗп рабочего %.2f",worker.salary );
        System.out.printf("\nЗп бухгалтера за провалы стала  %.2f", accountant.salary );
    }

}
