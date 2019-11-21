package ru.atom.geometry;

public class Bar implements Collider {
    private final int left;
    private final int right;
    private final int top;
    private final int bottom;


    public Bar(int firstCornerX, int firstCornerY, int secondCornerX, int secondCornerY) {
        this.left = Math.min(firstCornerX, secondCornerX);
        this.right = Math.max(firstCornerX, secondCornerX);
        this.top = Math.min(firstCornerY, secondCornerY);
        this.bottom = Math.max(firstCornerY, secondCornerY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // cast from Object to Point
        Bar bar = (Bar) o;

        return left == bar.left
                && right == bar.right
                && top == bar.top
                && bottom == bar.bottom;
    }

    @Override
    public boolean isColliding(Collider collider) {
        if (this == collider) return true;
        if (collider == null) return false;

        if (getClass() == collider.getClass()) {
            return isCollidingByBar((Bar) collider);
        }

        if (collider.getClass() == Point.class) {
            return isCollidingByPoint((Point) collider);
        }

        return false;
    }

    public boolean isCollidingByPoint(Point point) {
        return left <= point.getX()
                && right >= point.getX()
                && top <= point.getY()
                && bottom >= point.getY();
    }

    private boolean isCollidingByBar(Bar bar) {
        return !(left > bar.right || right < bar.left)
                && !(top > bar.bottom || bottom < bar.top);
    }
}
