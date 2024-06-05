package task_23_3_1;

public class PenaltyVisitor implements Visitor {
    private final int penalty;

    public PenaltyVisitor(int penalty) {
        this.penalty = penalty;
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(manager.getSalary() - penalty);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(salesPerson.getSalary() - penalty);
    }

    @Override
    public void visit(ITSupport itSupport) {
        itSupport.setSalary(itSupport.getSalary() - penalty);
    }
}
