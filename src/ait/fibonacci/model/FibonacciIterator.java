package ait.fibonacci.model;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int quantity;
    private int previous;
    private int prePriv;
    private int counter;

    public FibonacciIterator(int quantity) {
        this.quantity = quantity;
        this.previous = 1;
        this.prePriv = 1;
        this.counter = 1;
    }

    @Override
    public boolean hasNext() {
        return counter <= quantity;
    }

    @Override
    public Integer next() {
        if (counter++ <= 2) {

            return 1;
        }
        int temp = previous;
        previous += prePriv;
        prePriv = temp;
        return previous;
    }


}
