package ru.geekbrains.lesson1.regular;

/**
 * Декоратор. Он накладывает на результат декорации, так как внешний вид важен.
 */
public class Decorator {

    public static String decorate(int a) {
        /**
         * Метод декорирует число, добавляя к нему строку
         * при помощи функции форматирования строк 
         */
        return String.format("Результат = %d.", a);
    }
}
