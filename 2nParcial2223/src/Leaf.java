public class Leaf implements Component {

    int info;

    public Leaf(int info){
        this.info = info;
    }

    public int getInfo(){
        return this.info;
    }

    public void setInfo(int info){
        this.info = info;
    }

    @Override
    public void accept(ComponentVisitor v) {
        v.visit(this);
    }
}
