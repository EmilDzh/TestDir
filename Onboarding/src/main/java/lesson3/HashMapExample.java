package lesson3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Создадим HashMap. Ключом будет имя человека,
        // а значением - его возраст.
        Map<String, Integer> map = new HashMap<>();

        // Добавим элементы (пары ключ-значение).
        // Для этого используем метод put()
        map.put("Alice", 28);
        map.put("Dima", 25);
        map.put("Vasya", 18);

        // Получим значение по ключу
        Integer ageOfAlice = map.get("Alice");
        System.out.println("Возраст Alice: " + ageOfAlice);

        // Чтобы удалить элемент по ключу, используем метод remove()
        map.remove("Alice");

        // Проверка наличия ключа
        System.out.println("Содержит ли HashMap ключ 'Alice': " +
                map.containsKey("Alice"));

        // Итерация по элементам HashMap
        System.out.println("Итерация по элементам HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Возраст: " +
                    entry.getValue());
        }
    }
}
