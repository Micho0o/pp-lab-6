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
        Worker worker3 = new Worker("Gosia", 4500, 3, "04.12.2024", "Mlodsza ksiegowa");
        Worker worker4 = new Worker("Basia", 6000, 2, "05.05.2001", "Ksiegowa");


        Manager manager = new Manager("Janusz",7000, 5, "12.12.2012", "Manager logistyczny");


        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);  
        employees.add(worker4);  
        employees.add(manager);


        for (Employee employee : employees) 
        {
            System.out.println(employee.getName() + " has code  " + employee.hashCode());
        }


        for (Employee employee : employees) {
            if (employee instanceof Worker && employee.getSalary() == 3600) {
                if (employee.equals(worker1) || employee.equals(worker2) || employee.equals(worker3) || employee.equals(worker4) || employee.equals(manager)) {
                    System.out.println("Zduplikowane id pracownika " + employee.getName());
                }
            }
        }
    }
}