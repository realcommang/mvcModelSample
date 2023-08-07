package com.example.toy_project.model;

public class Study {
    private int id;
    private String name;
    private int max;
    private int headcount;
    private boolean open;
    private String password;
    private String explanation;

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public boolean getOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Override
    public String toString() {
        return "Study{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", max='" + max + '\'' +
                ", headcount='" + headcount + '\'' +
                ", explanation='" + explanation + '\'' +
                '}';
    }

}
