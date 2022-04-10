package Task3.Worker;

import java.lang.reflect.Array;

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
        Accountant accountantHead = new Accountant("Лариса","Главный бухгалтер",120_000);
        Accountant accountant = new Accountant("Светлана","Бухгалтер",80_000);
        Engineer engineer = new Engineer("Иван", "Главный инженер", 90_000);
        Worker worker = new Worker("Петр", "Рабочий", 50_000);

        accountant.countSomething();
        accountant.balance();
        accountant.decreaseSalary(10);
        worker.results();
        worker.increaseSalary(10);
        engineer.results();
        engineer.increaseSalary(15);
        System.out.printf("\nЗп рабочего стала %.2f",worker.salary );
        System.out.printf("\nЗп бухгалтера за провалы стала  %.2f", accountant.salary );

        Worker all[] = new Worker[4];
        all[0] = accountantHead;
        all[1] =accountant;
        all[2] =engineer;
        all[3]=worker;
        System.out.println("\nИтоговая ведомость работников");
        for (Worker next :all){
            System.out.printf("\nРаботник %s, должность %s, зарплата %.2f", next.name, next.position, next.salary);
        }
    }

}
