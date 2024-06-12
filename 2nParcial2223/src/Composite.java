import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Composite implements Component {

    List<Component> components;

    public Composite() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component c){
        this.components.add(c);
    }

    public List<Component> getComponents(){
        return Collections.unmodifiableList(this.components);
    }

    @Override
    public void accept(ComponentVisitor v) {
        v.visit(this);
    }
}
