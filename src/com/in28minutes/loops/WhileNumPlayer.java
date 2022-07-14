package com.in28minutes.loops;

public class WhileNumPlayer {
    private int limit;
    public WhileNumPlayer(int limit) {
        this.limit = limit;
    }

    public void printSquaresUptoLimit() {
        int i = 1;
        while (i * i < limit) {
            System.out.print(i * i + " ");
            i++;
        }
        System.out.println();
    }

    public void printCubesUptoLimit() {
        int i = 1;
        while (i * i * i < limit) {
            System.out.print(i * i * i + " ");
            i++;
        }
        System.out.println();
    }
}
