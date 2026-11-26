package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class TriangleTest {
    @Test
    void recognizesRightAngledTriangle() {
        assertEquals("Треугольник прямоугольный.", Main.classifyTriangle(3, 4, 5));
    }
    @Test
    void recognizesAcuteAngledTriangle() {
        assertEquals("Треугольник остроугольный.", Main.classifyTriangle(4, 5, 6));
    }
    @Test
    void recognizesObtuseAngledTriangle() {
        assertEquals("Треугольник тупоугольный.", Main.classifyTriangle(2, 3, 4));
    }
    @Test
    void rejectsSidesWhenTwoShorterSidesEqualTheLongestSide() {
        assertEquals("Из этих сторон нельзя составить треугольник.", Main.classifyTriangle(1, 2, 3));
    }
    @Test
    void rejectsSidesWhenTwoShorterSidesAreLessThanTheLongestSide() {
        assertEquals("Из этих сторон нельзя составить треугольник.", Main.classifyTriangle(1, 1, 3));
    }
    @Test
    void rejectsZeroLengthSide() {
        assertEquals("Стороны должны быть положительными числами.", Main.classifyTriangle(0, 2, 2));
    }
    @Test
    void rejectsNegativeLengthSide() {
        assertEquals("Стороны должны быть положительными числами.", Main.classifyTriangle(-1, 2, 2));
    }
}
