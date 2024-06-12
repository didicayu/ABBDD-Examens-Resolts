package Problema2;

public interface visitor {
    void visit(Sum sum);
    void visit(Mult mult);
    void visit(Constant constant);
}
