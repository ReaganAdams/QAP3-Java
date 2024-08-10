public class Demo {
    public static void main(String[] args) {
        // Create Point object and display
        Point p1 = new Point(2.0f, 3.0f);
        System.out.println("Point p1: " + p1);

        // Create MovablePoint object and display
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("MovablePoint mp1: " + mp1);

        // Move MovablePoint and display
        mp1.move();
        System.out.println("After moving mp1: " + mp1);
    }
}
