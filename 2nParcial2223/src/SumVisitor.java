import java.util.HashSet;
import java.util.Set;

public class SumVisitor implements ComponentVisitor {
    private int sum;
    Set<Component> visitedComponents = new HashSet<Component>();
    public SumVisitor() {
        sum = 0;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void visit(Leaf leaf){
        if(!visitedComponents.contains(leaf)){
            sum += leaf.getInfo();
            visitedComponents.add(leaf);
        }
    }

    @Override
    public void visit(Composite composite){
        if(!visitedComponents.contains(composite)){
            visitedComponents.add(composite);
            for (Component component : composite.getComponents()) {
                component.accept(this);
            }
        }
    }

    // a, b, c = {a, d}

    public static int getSum(Component component){
        SumVisitor sumVisitor = new SumVisitor();
        component.accept(sumVisitor);
        return sumVisitor.getSum();
    }
}
