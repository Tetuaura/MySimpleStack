package deqo.jtei.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by Jakline on 07/11/2016.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     *
     * @return true if this stack is empty
     *
     **/
    public boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     *
     *  @return the size of this stack
     *
     **/
    public int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item to add in stack
     **/
    public void push(Item item);

    /**
     * Looks at the object at the top of this stack.
     *
     * @return Item
     * @throws EmptyStackException if this stack is empty.
     **/
    public Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack.
     *
     * @return Item.
     * @throws EmptyStackException if this stack is empty.
     * @see Item
     * @see EmptyStackException
     **/
    public Item pop() throws EmptyStackException;
}
