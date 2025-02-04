package lesson3.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Book, String> bookLocation = new HashMap<>();
        bookLocation.put(new Book("LOTR", "Tolkien", 1930), "Номер полки 1");
        bookLocation.put(new Book("Me before you", "Jojo Moyes", 2010), "Номер полки 2");
        bookLocation.put(new Book("War and Peace", "Leo Tolstoy", 1869), "Номер полки 3");
        bookLocation.put(new Book("Pinocchio", "Carlo Collodi", 1856), "Номер полки 4");
        bookLocation.put(new Book("Harry Potter", "Rowling", 2005), "Номер полки 5");

        addBook(bookLocation, new Book("Новая книга", "Автор новый", 2025), "Номер полки 6");

        System.out.println(bookLocation);

        System.out.println("========== =================== ==========");

        removeBook(bookLocation, new Book("Новая книга", "Автор новый", 2025));

        System.out.println(bookLocation);

        findBook(bookLocation, new Book("Me before you", "Jojo Moyes", 2010));

        printAllBooks(bookLocation);


        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Ruben Amorim", "Coaching", 3),
                        new Student("Jose Mourinho", "Training", 5),
                        new Student("Carlo Ancelotti", "Motivating", 6),
                        new Student("Josep Gvardiola", "Takting", 5)
                )
        );

        System.out.println("--------- === ----------");

        System.out.println(groupStudents(students));

        addStudent(students, new Student("Новый Студент", "Новый Факультет", 0));

        System.out.println(students);


        removeStudent(students, new Student("Новый Студент", "Новый Факультет", 0));

        findStudent(students, "Coaching",  3);

        printAllStudents(students);



    }

    public static void addBook(Map<Book, String> bookLocation, Book newBook, String location) {
        bookLocation.put(newBook, location);
        System.out.println("Добавлена книга: " + newBook + " на полку: " + location);
    }

    public static void removeBook(Map<Book, String> bookLocation, Book bookToRemove) {

        bookLocation.remove(bookToRemove);
    }

    public static void findBook(Map<Book, String> library, Book searchingBook) {
        String location = library.get(searchingBook);
        if (location != null) {
            System.out.println("Книга найдена: " + searchingBook + ". Местонахождение: " + location);
        } else {
            System.out.println("Книга не найдена: " + searchingBook);
        }
    }

    public static void printAllBooks(Map<Book, String> books) {
        books.forEach((book, location) ->
                System.out.println("Книга: " + book + " Местонахождение: " + location)
        );
    }

    public static Map<String, List<Student>> groupStudents(List<Student> students) {

        Map<String, List<Student>> resultMap = new HashMap<>();

        for (Student student : students) {

            String key = student.getFaculty() + "-" + student.getAge();

            if (!resultMap.containsKey(key))
                resultMap.put(key, new ArrayList<>());

            resultMap.get(key).add(student);
        }

        return resultMap;


    }

    public static void addStudent(List<Student> students, Student newStudent) {

        students.add(newStudent);

    }

    public static void removeStudent(List<Student> students, Student studentToRemove) {

        students.removeIf(student -> student.getName().equals(studentToRemove.getName()) && student.getFaculty().equals(studentToRemove.getFaculty()) && student.getAge() == studentToRemove.getAge());

    }

    public static void findStudent(List<Student> students, String faculty, int age) {

        for (Student student : students) {
            if (student.getAge() == age && student.getFaculty().equals(faculty))
                System.out.println(student);
        }
    }

    public static void printAllStudents(List<Student> students) {
        System.out.println(groupStudents(students));
    }
}
