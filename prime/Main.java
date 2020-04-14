package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Path filePath = Paths.get(args[0]);
        try (Stream<String> lines = Files.lines(filePath)) {
//            lines.forEach(a->  System.out.println(!IntStream.rangeClosed(2, Integer.parseInt(a)/2).
//                    anyMatch(i -> Integer.parseInt(a)%i == 0)&&Integer.parseInt(a)>1?1:0));
//            System.out.println();
//            lines.forEach(System.out::println);
            lines.map(a->Integer.parseInt(a))
                    .map(b->(!IntStream.rangeClosed(2, b/2)
                            .anyMatch(i -> b%i == 0)&&b>1?1:0))
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
