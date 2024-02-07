package org.github.mahambach.Bonus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class BonusMain {
    public static void main(String[] args) {
        try {
            List<String> line = Files.lines(Path.of("students.csv"))
                    .peek(System.out::println)
                    .toList();
            System.out.println(line);
        }
        catch(IOException e){
            System.out.println("lol");
            e.printStackTrace();
        }

    }
}
