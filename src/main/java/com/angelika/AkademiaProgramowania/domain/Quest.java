package com.angelika.AkademiaProgramowania.domain;

/**
 * Created by &[User] and &[Date].
 */
public class Quest {

    private String description;

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

}
