public interface ComponentVisitor {
    void visit(Leaf leaf);
    void visit(Composite composite);
}
