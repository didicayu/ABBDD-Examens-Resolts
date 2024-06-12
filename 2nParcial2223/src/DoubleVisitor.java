public class DoubleVisitor implements ComponentVisitor{



    @Override
    public void visit(Leaf leaf) {
        int doubleInfo = leaf.getInfo();
        leaf.setInfo(doubleInfo * 2);
    }

    @Override
    public void visit(Composite composite) {
        for (Component component : composite.getComponents()) {
            component.accept(this);
        }
    }

    public static void doubleInfo(Component component){
        component.accept(new DoubleVisitor());
    }
}
