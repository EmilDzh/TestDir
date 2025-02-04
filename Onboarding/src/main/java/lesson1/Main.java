package lesson1;

public class Main {
    public static void main(String[] args) {
        User.printCount(); //выведет 2
        User vlad = new User(1L, "VladMishustin", "mishaNumberOne@gmail.com", 27);

        User elon = new User(2L, "ElonMask", "elon@gmail.com", 37);

        Shape circle = new Circle(2,5);

        Shape square = new Square();

        askShapes(new Shape[]{circle, square}); // console output: Circle, Square

        vlad.count++;
        elon.count++;
        System.out.println(elon.count); //выведет 2
        User.printCount(); //выведет 2

        System.out.printf("User 1 id: %d, username: %s\n", vlad.getId(), vlad.getUsername());
        System.out.printf("User 2 id: %d, username: %s\n", elon.getId(), elon.getUsername());

        int dayOfWeek = 2;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }

    private static void askShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.printWhoIAm();
        }


    }
}
