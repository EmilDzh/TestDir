package lesson3;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.HashMap<>();
        map.put("Alice", 28);
        Integer ageOfAlice = map.get("Alice");
        map.remove("Alice");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Возраст: " +
                    entry.getValue());
        }
    }
}
