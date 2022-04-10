package Task3.Worker;

public class Engineer extends Worker{
    public Engineer(String name, String position, int salary) {
        super(name, position, salary);


    }
    @Override
    public void results(){
        System.out.println(name + " разработал новую деталь ");

    }
}
