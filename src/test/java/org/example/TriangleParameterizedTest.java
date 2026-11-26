package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
class TriangleParameterizedTest {
    @ParameterizedTest
    @MethodSource("triangleCases")
    void returnsExpectedResultForSides(int a, int b, int c, String expected) {
        assertEquals(expected, Main.classifyTriangle(a, b, c));
    }
    private static Stream<Arguments> triangleCases() {
        return Stream.of(
                arguments(3, 4, 5, "Треугольник прямоугольный."),
                arguments(4, 5, 6, "Треугольник остроугольный."),
                arguments(2, 3, 4, "Треугольник тупоугольный."),
                arguments(1, 2, 3, "Из этих сторон нельзя составить треугольник."),
                arguments(1, 1, 3, "Из этих сторон нельзя составить треугольник."),
                arguments(0, 2, 2, "Стороны должны быть положительными числами."),
                arguments(-1, 2, 2, "Стороны должны быть положительными числами.")
        );
    }
}
