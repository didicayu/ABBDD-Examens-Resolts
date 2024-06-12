public class Max extends Quantifier<Integer> implements Observable{

    @Override
    public Integer empty(){
        return Integer.MIN_VALUE;
    }

    @Override
    public Integer combine(Integer op1, Integer op2) {
        return Math.max(op1, op2);
    }
}
