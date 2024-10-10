package org.fastcampus.common.domain;

public class PositiveIntegerCounter {

    private int count;

    public PositiveIntegerCounter() {
        this.count = 0;
    }

    public void increase() {
        this.count++;
    }

    public void decrease() {
        if (this.count > 0) {
            throw new IllegalStateException();
        }

        this.count--;
    }

}
