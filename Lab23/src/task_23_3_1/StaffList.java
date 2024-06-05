package task_23_3_1;

import java.util.ArrayList;

public class StaffList implements Employee {

    private final ArrayList<Employee> salaries = new ArrayList<>();

    public StaffList() {
    }

    public void addEmployee(Employee employee){
        salaries.add(employee);
    }

    @Override
    public int getSalary() {
        int sum = 0;
        for (Employee salary : salaries) {
            sum += salary.getSalary();
        }
        return sum;
    }

    @Override
    public void accept(Visitor visitor) {
        for (Employee salary : salaries) {
            salary.accept(visitor);
        }
    }
}
