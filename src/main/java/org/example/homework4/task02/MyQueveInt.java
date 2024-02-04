package org.example.homework4.task02;

import java.util.LinkedList;

class MyQueueInt {
    private final LinkedList<Integer> elements = new LinkedList<>();

    public void enqueue(int element) {
        elements.add(element);
    }

    public void dequeue() {
        elements.removeFirst();
    }

    public int first() {
        return elements.getFirst();
    }

    public LinkedList<Integer> getElements() {
        return elements;
    }
}
