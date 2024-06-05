package task_23_3_1;

public interface Visitor {
    void visit(Manager manager);
    void visit(SalesPerson salesPerson);
    void visit(ITSupport itSupport);
}