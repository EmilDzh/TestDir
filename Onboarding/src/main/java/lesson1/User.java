package lesson1;

public class User {

    private long id;

    private String username;

    private String email;

    private int age;

    static long count = 0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.isBlank()) {
            System.out.println("Ohoh! Username cannot be blank!");
        } else {
            this.username = username;
        }
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHi() {
        System.out.printf("Hi, I'm %s", username);
    }

    public static void printCount() {
        System.out.println(count);
    }

    public User(long id, String username, String email, int age) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.age = age;
    }

    public void printUser() {
        System.out.printf("User %s, id: %d\\n", username, id);
    }

    public void printUser(boolean withCount) {
        if (withCount) {
            System.out.printf("User %s, id: %d, count: %d\\n", username, id, count);
        } else {
            printUser();
        }
    }

    public User() {
        this.id = -1;
        this.username = "unknown";
    }

    public User(long id) {
        this.id = id;
        this.username = "unknown";
    }

    public User(String username) {
        this.id = -1;
        this.username = username;
    }

    public User(long id, String username) {
        this.id = id;
        this.username = username;
    }
}
