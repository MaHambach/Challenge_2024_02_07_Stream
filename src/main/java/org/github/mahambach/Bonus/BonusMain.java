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
                    .skip(1)                                 //Überspringt die erste Zeile.
                    .filter(n-> !n.isEmpty())                   //Löscht leere Strings.
                    .map(n-> n.split(","))                //Teilt den String an allen "," auf in ein String-Array.
                    .map(n -> new Student(                      //Für jedes der String-Arrays wird ein Student erstellt.
                            Integer.valueOf(n[0]),
                            n[1],
                            Integer.valueOf(n[2]),
                            Integer.valueOf(n[3]))
                    )
                    .collect(Collectors.toSet())                //Erstellt aus den Studenten eine Studenten-Menge. Dadurch werden Duplikate gelöscht.
                    .stream()                                   //Da wir eine Menge haben, müssen wir hier einen neuen Stream starten.
                    .collect(Collectors.toList())               //
                    .stream()
                    .sorted((a,b) -> a.getId() - b.getId())
                    .forEach(System.out::println);

            System.out.println();

            Files.lines(Path.of("students.csv"))
                    .skip(1)                                 //Überspringt die erste Zeile.
                    .filter(n-> !n.isEmpty())                   //Löscht leere Strings.
                    .map(n-> n.split(","))                //Teilt den String an allen "," auf in ein String-Array.
                    .map(n -> new Student(                      //Für jedes der String-Arrays wird ein Student erstellt.
                            Integer.valueOf(n[0]),
                            n[1],
                            Integer.valueOf(n[2]),
                            Integer.valueOf(n[3]))
                    )
                    .distinct()                                  //Löscht Duplikate.
                    .forEach(System.out::println);

        }
        catch(IOException e){
            System.out.println("lol");
            e.printStackTrace();
        }

    }
}
