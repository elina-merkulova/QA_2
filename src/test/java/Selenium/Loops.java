package Selenium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    @Test
    public void loopsLesson() {
        List<String> studentNames = new ArrayList<>();

        System.out.println(studentNames.isEmpty());

        studentNames.add("Dmitry");
        studentNames.add("Svetlana");
        studentNames.add("Sergey");
        studentNames.add("Elina");
        studentNames.add("Daniil");
        studentNames.add("Klara");
        studentNames.add("Elvira");
        studentNames.add("Deniss");

        System.out.println(studentNames.get(1));
        System.out.println(studentNames.size());
        System.out.println(studentNames.isEmpty());

       for (int i = 0; i <studentNames.size(); i++) {
            System.out.println(studentNames.get(i));
        }
        for (String name : studentNames) {
            if (name.startsWith("D")) {
                System.out.println(name);
            }
            
        }
    }
}
