import org.w3c.dom.css.Rect;

public class MyClass {
    public static void main(String[] args) {

//        Point p = new Point();
//        Point p2 = new Point();
//
//        p.x = 10;
//        p.y = 20;
//
//        p2.x = 30;
//        p2.y = 40;
//
//        System.out.println(p.x + " " + p.y); // 10 20
//        System.out.println(p2.x + " " + p2.y); // 30 40

        Rectangle rect = new Rectangle();
        rect.topLeft.x = 0;
        rect.topLeft.y = 0;
        rect.bottomRight.x = 100;
        rect.bottomRight.y = 100;

        System.out.println(rect.topLeft.x + " " +
                           rect.topLeft.y + " " +
                           rect.bottomRight.x + " " +
                           rect.bottomRight.y
        );

    }
}
