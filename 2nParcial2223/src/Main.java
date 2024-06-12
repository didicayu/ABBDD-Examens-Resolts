import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Leaf a = new Leaf(50);
        Leaf b = new Leaf(100);
        Composite c = new Composite();
        Leaf d = new Leaf(75);

        Composite e = new Composite();

        c.addComponent(a);
        c.addComponent(d);
        c.addComponent(e);

        e.addComponent(a);
        e.addComponent(b);
        e.addComponent(c);

        // e -> a,b, c = {a, d}

//        DoubleVisitor.doubleInfo(c);
//
//        List<Component> componentList = c.getComponents();
//        int totalLeafValue = 0;
//        for (Component component : componentList) {
//            Leaf leaf = (Leaf) component;
//            totalLeafValue += leaf.getInfo();
//        }
//        System.out.println(totalLeafValue);

        System.out.println(SumVisitor.getSum(e));
    }
}