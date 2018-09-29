package com.library.bookmanage.Controller.login;

public class Login {

    private final long id;
    private final String context;

    public Login(long id, String context) {
        this.id = id;
        this.context = context;
    }

    public long getId() {
        return id;
    }

    public String getContext() {
        return context;
    }
}
