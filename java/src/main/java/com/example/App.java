package com.example;
import java.util.Arrays;

import main.java.com.example.Easy.TwoSum;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Arrays.stream(TwoSum.run(new int[]{2, 7, 11, 15}, 9)).forEach(v -> System.out.println(v));
    }
}
