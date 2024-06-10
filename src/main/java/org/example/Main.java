package org.example;

import java.util.Map;

import static org.example.ElementCounter.countElements;

public class Main {
    public static void main(String[] args) {
        // Пример использования
        Object[] myArray = {"apple", "banana", "cherry", "apple", "banana", "date"};
        Map<Object, Integer> result = countElements(myArray);
        System.out.println(result); // Вывод: {apple=2, banana=2, cherry=1, date=1}
    }
}