package com.github.dd_buntar;

import com.github.dd_buntar.university.Dean;
import com.github.dd_buntar.university.Faculty;
import com.github.dd_buntar.university.Institute;
import com.github.dd_buntar.university.Researcher;
import com.github.dd_buntar.university.University;

public class App {
    public static void main(String[] args) {
        Researcher[] researchers1 = new Researcher[]{
                new Researcher("12DS", "Научный деятель 1", "research1@mail.ru", "Человеко-машинный интерфейс", null),
                new Researcher("12ЗS", "Научный деятель 2", "research2@mail.ru", "ООП", null)
        };

        Researcher[] researchers2 = new Researcher[]{
                new Researcher("42DS", "Научный деятель 3", "research3@mail.ru", "Ядерная физика", null),
                new Researcher("42ЗS", "Научный деятель 4", "research4@mail.ru", "Электроника", null)
        };

        Institute institute1 = new Institute("ПиИТ", "Университетская площадь, 1",researchers1 );
        Institute[] institutes1 = new Institute[]{institute1};
        Institute institute2 = new Institute("Ядерная физика", "Университетская площщаль 1", researchers2);
        Institute[] institutes2 = new Institute[]{institute2};

        Faculty faculty1 = new Faculty("Факультет компьютерных наук", institutes1,
                new Dean("7F47", "Крыловецкий А. А.", "csf@mail.ru"));

        Faculty faculty2 = new Faculty("Физический факультет", institutes2,
                new Dean("1LF3", "Иванов И. И.", "physfac@mail.ru"));

        University university = new University("ВГУ", 1000, new Faculty[]{faculty1, faculty2});
        System.out.println(university);
    }
}
