package com.jdkTests.leetcode;

public class SealedClassTest {

    public sealed class Shape
        permits Circle, Triangle {
        public double area(){
            return 0.0;
        }
    }

    // Final subclass: cannot be extended further
    public final class Circle extends Shape{
        private final double radius;
        public Circle(double radius) { this.radius = radius; }

        @Override
        public double area() { return Math.PI * radius * radius; }
    }

    // Non-sealed subclass: opens inheritance back up
    public non-sealed class Triangle extends Shape {
        // Anyone can extend Triangle
    }

    static void main() {

    }
}
