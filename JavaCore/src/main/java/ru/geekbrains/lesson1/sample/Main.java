package ru.geekbrains.lesson1.sample;

import ru.geekbrains.lesson1.regular.Decorator;
import ru.geekbrains.lesson1.regular.OtherClass;

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.sum(5,6);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(4,5);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(5,2);
        System.out.println(Decorator.decorate(result));
    }
}


