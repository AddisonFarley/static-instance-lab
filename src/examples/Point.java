// Addison Farley
// SDEV 219
// static vs instance friday lab

package examples;

public class Point
{
    private double x;
    private double y;

    private static int pointCount;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;

        pointCount++;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void foo()
    {
        //Rule: can't access instanced fields/methods inside static methods
        //System.out.println("x: " + x + ",y: " + y);

        //System.out.println(toString());

        //call a static method
        System.out.println(getPointCount());

        //refer to a static field
        System.out.println(pointCount);
    }

    public static int getPointCount()
    {
        return pointCount;
    }

    public static boolean isOrigin(Point point)
    {
        if(point.x == 0.0 && point.y == 0.0)
        {
            return true;
        }

        return false;
    }
}
