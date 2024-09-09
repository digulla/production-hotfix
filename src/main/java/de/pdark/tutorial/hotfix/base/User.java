package de.pdark.tutorial.hotfix.base;

public class User {

    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "(name=" + name
                + ")";
    }
}
