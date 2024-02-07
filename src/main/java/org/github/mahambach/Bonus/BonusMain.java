package org.github.mahambach.Bonus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BonusMain {
    public static void main(String[] args) {
        try {
            Files.lines(Path.of("students.csv"))
                    .skip(1)
                    .filter(n-> !n.isEmpty())
                    .map(n-> n.split(","))
                    .map(n -> new Student(
                            Integer.valueOf(n[0]),
                            n[1],
                            Integer.valueOf(n[2]),
                            Integer.valueOf(n[3]))
                    )
                    .collect(Collectors.toSet())
                    .forEach(System.out::println);

        }
        catch(IOException e){
            System.out.println("lol");
            e.printStackTrace();
        }

    }
}
