package pattern.composite1;

import java.util.ArrayList;
import java.util.List;

public class EnterPrise {
    private List<Employee> employees = new ArrayList<>();

   public void addEmployee(Employee e) {
       employees.add(e);
   }

   public void makeLocator(){
       System.out.println("EnterPrise produce locator...");
       for (Employee e : employees) {
           e.doWork();
       }
   }
}
