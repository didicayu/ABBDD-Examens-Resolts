public class Main {
    public static void main(String[] args) {
        try {
            Rectangle rect = (Rectangle) Figure
                    .create()
                    .at(1, 1)
                    .withDimensions(5, 10)
                    .execute();

            System.out.println(rect.x);
            System.out.println(rect.y);
            System.out.println(rect.width);
            System.out.println(rect.height);


            Circle circle = (Circle) Figure
                    .create()
                    .at(2, 2)
                    .withRadius(3)
                    .execute();

            System.out.println(circle.x);
            System.out.println(circle.y);
            System.out.println(circle.radius);


        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}