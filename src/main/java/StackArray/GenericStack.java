package StackArray;

import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> extends Stack<E> {
    private E[] elements;
    private int size;
    
    public E[] getElements() {
        return elements;
    }
    
    public void setElements(E[] elements) {
        this.elements = elements;
    }
    
    public int getSize() {
        return size;
    }
    
    @Override
    public void setSize(int size) {
        this.size = size;
    }
    
    public GenericStack() {
        elements = (E[]) new Object[8];
        size = 0;
        
    }
    
    public E push(E object) {
        E[] newElements = Arrays.copyOf(elements, elements.length + 1);
        newElements[newElements.length - 1] = object;
        this.elements = newElements;
        return object;
    }
    
    public E pop() {
        return elements[size - 1];
    }
}
