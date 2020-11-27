package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point (int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point another) {
        return sqrt(pow(this.x - another.x, 2) + pow(this.y - another.y, 2));
    }

    public double distance3D(Point another) {
        return sqrt(pow(this.z - another.z, 2) + pow(this.x - another.x, 2) + pow(this.y - another.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(4, 3, 3);
        Point d = new Point(0, 2, 3);
        double dist = a.distance(b);
        System.out.println(dist);
        double dist3d = c.distance3D(d);
        System.out.println(dist3d);
    }
}
