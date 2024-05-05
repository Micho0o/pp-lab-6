import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;


public class Main 
{
    public static void main(String[] args) 
    {
        Worker worker1 = new Worker("Michal", 3500, 1, "15.10.2019", "Kasier");
        Worker worker2 = new Worker("Adam", 3600, 2, "23.11.2020", "Magazynier");
        Worker worker3 = new Worker("Gosia", 4500, 2, "04.12.2024", "Mlodsza ksiegowa");
        Worker worker4 = new Worker("Basia", 6000, 2, "05.05.2001", "Ksiegowa");
        Worker worker5 = new Worker("Kasia", 6000, 5, "05.05.2004", "Ksiegowa");


        Manager manager1 = new Manager("Janusz",7000, 2, "12.12.2012", "Manager logistyczny");
        Manager manager2 = new Manager("Grzegorz",6000, 7, "12.12.2010", "Manager sklepu");


        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);  
        employees.add(worker4);
        employees.add(worker5);  
        employees.add(manager1);
        employees.add(manager2);


        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) 
        {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) 
            {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) 
            {
                totalWorkerSalary += employee.getSalary();
            }
        }


        System.out.println("Wynagrodzenie laczne " + totalSalary);
        System.out.println("Wynagrodzenie menagerow " + totalManagerSalary);
        System.out.println("Wynagrodzenie pracownikow " + totalWorkerSalary);


        System.out.println("Te same id pracownikow ");
        for (Employee employee : employees) {
            for (Employee other : employees) {
                if (employee != other && employee.hashCode() == other.hashCode()) {
                    System.out.println(employee.getName());
                    break;
                }
            }
        }
    }
}