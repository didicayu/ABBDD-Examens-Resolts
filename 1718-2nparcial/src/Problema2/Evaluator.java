package Problema2;

public class Evaluator implements visitor{

    int evaluation;
    public Evaluator(){
        evaluation = 0;
    }

    @Override
    public void visit(Sum sum) {
        Expression left = sum.getLeft();
        Expression right = sum.getRight();
        left.accept(this);
        int leftVal = this.getEvaluation();
        right.accept(this);
        int rightVal = this.getEvaluation();

        evaluation = leftVal + rightVal;
    }

    @Override
    public void visit(Mult mult) {
        Expression left = mult.getLeft();
        Expression right = mult.getRight();
        left.accept(this);
        int leftVal = this.getEvaluation();
        right.accept(this);
        int rightVal = this.getEvaluation();

        evaluation = leftVal * rightVal;
    }

    @Override
    public void visit(Constant constant) {
        evaluation = constant.getValue();
    }

    public int getEvaluation(){
        return evaluation;
    }
}
