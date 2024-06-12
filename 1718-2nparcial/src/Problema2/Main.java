package Problema2;

public class Main {
    public static void main(String[] args) {
        Expression exp = new Sum(new Constant(2), new Mult(new Constant(4), new Constant(8)));
        Evaluator evaluator = new Evaluator();
        exp.accept(evaluator);
        System.out.println(evaluator.getEvaluation());
    }
}