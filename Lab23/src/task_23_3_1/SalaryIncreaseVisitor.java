package task_23_3_1;

public class SalaryIncreaseVisitor implements Visitor {
    private final double increasePercentage;

    public SalaryIncreaseVisitor(double increasePercentage) {
        this.increasePercentage = increasePercentage;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary((int) (manager.getSalary() * (1 + increasePercentage / 100)));
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary((int) (salesPerson.getSalary() * (1 + increasePercentage / 100)));
    }

    @Override
    public void visit(ITSupport itSupport) {
        itSupport.setSalary((int) (itSupport.getSalary() * (1 + increasePercentage / 100)));
    }
}
