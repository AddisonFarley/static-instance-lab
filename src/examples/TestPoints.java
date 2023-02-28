// Addison Farley
// SDEV 219
// static vs instance friday lab

package examples;

public class TestPoints
{
    public static void main(String[] args)
    {
        Point first = new Point(10,10);
        Point second = new Point(30,20);
        Point origin = new Point(0,0);

        System.out.println(first);
        System.out.println(second);

        System.out.println(Point.isOrigin(first));
        System.out.println(Point.isOrigin(origin));

        System.out.println("Points created: " + Point.getPointCount());

        Point.foo();
    }
}
