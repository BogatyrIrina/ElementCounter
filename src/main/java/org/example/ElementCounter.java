package org.example;

import java.util.HashMap;
import java.util.Map;

public class ElementCounter {
    public static Map<Object, Integer> countElements(Object[] elements) {
        Map<Object, Integer> elementCount = new HashMap<>();

        // Проходим по всем элементам массива
        for (Object element : elements) {
            // Если элемент уже есть в Map, увеличиваем его счетчик на 1
            if (elementCount.containsKey(element)) {
                elementCount.put(element, elementCount.get(element) + 1);
            }
            // Иначе добавляем новый элемент с начальным счетчиком 1
            else {
                elementCount.put(element, 1);
            }
        }

        return elementCount;
    }
}
