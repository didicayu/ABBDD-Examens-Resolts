import java.util.ArrayList;
import java.util.List;

public abstract class Quantifier<E> implements Expression<E> {

    List<E> subExpressions = new ArrayList<E>();

    public void addExpression(Expression<E> expr) {

    }

    public void removeExpression(Expression<E> expr) {

    }

    @Override
    public E evaluate(){
        return null;
    }

    public abstract E empty();
    public abstract E combine(E op1, E op2);
}
