package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;
    
    public ArrayList<E> getElements() {
        return elements;
    }
    
    public void setElements(ArrayList<E> elements) {
        this.elements = elements;
    }
    
    public int getCounter() {
        return counter;
    }
    
    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    private int counter = 0;
    
    public Stack() {
        this.elements = new ArrayList<E>();
    }
    
    public Boolean isEmpty() {
        return elements.isEmpty();
    }
    
    public void push(E object) {
        if (elements.isEmpty()) {
            elements.add(object);
        } else {
            elements.add(object);
            counter++;
        }
    }
    
    public E pop() {
        E element;
        if (!elements.isEmpty()) {
            element = elements.get(counter);
            elements.remove(element);
            counter--;
        } else {
            throw new IndexOutOfBoundsException();
        }
        return element;
    }
}
