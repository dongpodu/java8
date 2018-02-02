package me.java8.function.domain;

/**
 * author will
 * 2018/2/2.
 */
public class Track {
    private String name;
    private int lenght;

    public Track(String name, int lenght) {
        this.name = name;
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
