package org.example.practice;

public class Pair {
    private String from;
    private String to;

    public boolean equals(Object object) {
        Pair pair = (Pair) object;
        return from.equals(pair.from) && to.equals(pair.to);
    }

    public int hashCode() {
        return 0;
    }

    public Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }
}
