package io.gocklkatz.generics;

import java.util.function.Function;

public class MyGenerics {

    public static void main(String[] args) {
        System.out.println("Hello lovely Generics!");

        Function<Lesson, Timeslot> getTimeslot = Lesson::getTimeslot;
    }
}
