package deqo.jtei.MySimpleStack;

/**
 * Created by Jakline on 07/11/2016.
 */
public class Item {
    /**
     * The {@link Object} instance representing something.
     */
    private Object value;

    /**
     * @param value The value of this object
     */
    Item(Object value) {
        setValue(value);
    }

    /**
     * @return value to get in stack
     */
    public Object getValue() {
        return value;
    }

    /**
     * @param value The value of this object
     */
    public void setValue(Object value) {
        this.value = value;
    }
}
