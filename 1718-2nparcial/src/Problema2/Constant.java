package Problema2;

public class Constant implements Expression {
    int n;
    public Constant(int n){
        this.n = n;
    }

    public int getValue(){
        return n;
    }

    @Override
    public void accept(Evaluator visitor) {
        visitor.visit(this);
    }
}
