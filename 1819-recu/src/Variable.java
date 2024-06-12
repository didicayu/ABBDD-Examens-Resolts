import com.sun.jdi.Value;

public class Variable<E> implements Expression<E> {

    ValueChanged<E> valueChanged;
    E value;

    public Variable(E value) {
       this.value = value;
    }

    @Override
    public E evaluate(){
        return null;
    }

    public void setValue(E newValue) {
        this.valueChanged = new ValueChanged<>(value, newValue);
    }
}
