class Employee{
    public String work(){
        return "Devloping project";
    }
    public String getSalary(){
        return "salary credited";
    }
}
class Manager extends Employee{
    public String work(){
        return "completed work";
    }
}
class Developer extends Employee{
    public String writeCode(){
        return "code executed";
    }
}
public class MainEmployee{
    public static void main(String[] args) {
        // Instantiate the subclasses
        Manager manager = new Manager();
        Developer developer = new Developer();

        // Demonstrate their methods
        System.out.println("Manager work: " + manager.work());
        System.out.println("Manager salary: " + manager.getSalary());
        System.out.println("Developer work: " + developer.work());
        System.out.println("Developer writeCode: " + developer.writeCode());
        System.out.println("Developer salary: " + developer.getSalary());
    }
}
