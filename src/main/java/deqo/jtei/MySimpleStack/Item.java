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
     * @param value
     */
    Item(final Object value) {
        this.value = value;
    }

    /**
     * Un commentaire répondant à l'exigence #1
     * @return
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
