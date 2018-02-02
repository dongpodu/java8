package me.java8.function.domain;

import java.util.List;

/**
 * author will
 * 2018/2/2.
 */
public class Artist {
    private String name;
    private List<Member> members;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
