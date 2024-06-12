package Problema2;

public class Mult extends BinaryOperation {

    public Mult(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public void accept(Evaluator visitor) {
        visitor.visit(this);
    }
}
