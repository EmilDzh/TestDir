package lesson2;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person(22, "Gleb"));
        linkedList.add(new Person(35, "Sergey"));
        linkedList.add(new Person(14, "Svetlana"));
        linkedList.add(new Person(27, "Alexey"));

        //Получить последний элемент списка
        //Вывод: Person{age=27, name='Alexey'}
        System.out.println(linkedList.getLast());

        //Получить первый элемент списка
        //Вывод: Person{age=22, name='Gleb'}
        System.out.println(linkedList.getFirst());

        //Также, можно с linkedList работать как со стеком или очередью.
        //Добавить в начало списка элемент
        linkedList.push(new Person(90, "Valentin"));

        //Удалить и вернуть
        linkedList.pop();
    }
}
