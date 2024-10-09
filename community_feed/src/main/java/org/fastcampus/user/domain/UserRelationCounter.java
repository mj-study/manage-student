package org.fastcampus.user.domain;

public class UserRelationCounter {

    private int count;

    public UserRelationCounter() {
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
