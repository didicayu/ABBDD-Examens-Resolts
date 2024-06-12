package Problema2;

public class Sum extends BinaryOperation {

    public Sum(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public void accept(Evaluator visitor) {
        visitor.visit(this);
    }
}
