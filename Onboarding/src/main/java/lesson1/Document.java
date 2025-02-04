package lesson1;

public class Document implements Printable {
    private String text;

    public Document(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}
