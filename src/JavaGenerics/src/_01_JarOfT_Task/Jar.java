package _01_JarOfT_Task;

import java.util.ArrayDeque;

public class Jar<E> {
    private ArrayDeque<E> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(E element) {
        elements.push(element);
    }

    public E remove() {
        return elements.pop();
    }
}
