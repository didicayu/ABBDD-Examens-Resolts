
public class Main {
    public static void main(String[] args) {
        Rectangle rect = (Rectangle) Rectangle.create().at(2f,3f).at(400,500).withDimensions(4,5).at(4,5).withDimensions(400,500).execute();
        System.out.println("a");
    }
}