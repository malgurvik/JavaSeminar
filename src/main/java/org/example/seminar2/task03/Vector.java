package org.example.seminar2.task03;

public class Vector {
    private double x;

    private double y;

    private double z;

    public Vector() {
        this.x = 1.0;
        this.y = 1.0;
        this.z = 1.0;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return результат
     * @apinote метод вычисляющий длину вектора
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector2
     * @return
     * @apinote •	метод, вычисляющий скалярное произведение
     */
    public double scalar(Vector vector2) {
        return x * vector2.getX() + y * vector2.getY() + z * vector2.getZ();
    }

    /**
     * @apiNote •	метод, вычисляющий векторное произведение с другим вектором
     * @param vector2
     * @return
     */
    public Vector multiply(Vector vector2) {
        return new Vector(
                y * vector2.getZ() - z * vector2.getY(),
                z * vector2.getX() - x * vector2.getZ(),
                x * vector2.getY() - y * vector2.getX());
    }

    /**
     * @apiNote •	метод, вычисляющий угол между векторами (или косинус угла)
     * @param vector2
     * @return результат
     */
    public double cos(Vector vector2) {
        return scalar(vector2)/(length()* vector2.length());
    }


    public Vector sum(Vector vector2) {
        return new Vector(x+ vector2.getX(), y+ vector2.getY(), z+ vector2.getZ());
    }

    public Vector degree(Vector vector2) {
        return new Vector(x- vector2.getX(), y- vector2.getY(), z- vector2.getZ());
    }
}
