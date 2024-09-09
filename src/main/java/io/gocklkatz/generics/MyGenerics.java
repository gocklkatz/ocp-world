package io.gocklkatz.generics;

import java.util.function.Function;

public class MyGenerics {

    public static void main(String[] args) {
        System.out.println("Hello lovely Generics!");

        Function<Lesson, Timeslot> getTimeslot = Lesson::getTimeslot;

        Timeslot timeslot = new Timeslot();
        Lesson lesson = new Lesson();
        lesson.setTimeslot(timeslot);

        Timeslot t2 = getTimeslot.apply(lesson);
    }
}
