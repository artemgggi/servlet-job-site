package com.job4you;

import java.io.File;

public class ForTest {
    public static void main(String[] args) {
        for (File file : new File("src/images").listFiles()) {
            System.out.println(file.getName());
        }
    }
}
