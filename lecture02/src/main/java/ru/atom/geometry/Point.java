package ru.atom.geometry;

/**
 * Template class for
 */
public class Point implements Collider {
    private final int x;
    private final int y;

    // fields
    // and methods
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param o - other object to check equality with
     * @return true if two points are equal and not null.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // cast from Object to Point
        Point point = (Point) o;

        // your code here
        return x == point.x && y == point.y;
    }

    @Override
    public boolean isColliding(Collider collider) {
        if (this == collider) return true;
        if (collider == null) return false;
        if (collider.getClass() == getClass()) return equals(collider);
        if (collider.getClass() == Bar.class) return ((Bar)collider).isCollidingByPoint(this);
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
