package org.example;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три положительных целых числа — длины сторон:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(classifyTriangle(a, b, c));
    }
    static String classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Стороны должны быть положительными числами.";
        }
        int[] sides = {a, b, c};
        Arrays.sort(sides);
        int first = sides[0];
        int second = sides[1];
        int longest = sides[2];
        if ((long) first + second <= longest) {
            return "Из этих сторон нельзя составить треугольник.";
        }
        BigInteger shorterSidesSquares = square(first).add(square(second));
        BigInteger longestSideSquare = square(longest);
        if (longestSideSquare.equals(shorterSidesSquares)) {
            return "Треугольник прямоугольный.";
        } else if (longestSideSquare.compareTo(shorterSidesSquares) < 0) {
            return "Треугольник остроугольный.";
        } else {
            return "Треугольник тупоугольный.";
        }
    }
    private static BigInteger square(int number) {
        BigInteger value = BigInteger.valueOf(number);
        return value.multiply(value);
    }
}
