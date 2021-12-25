package src.ru.vsu.sc.savenkova_a_v;

import src.ru.vsu.sc.savenkova_a_v.Figures.Line;
import src.ru.vsu.sc.savenkova_a_v.Figures.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Picture picture = new Picture(new Line(3, -7 / 4),
                new Line(-2, 1), new Rectangle(0, -1, 10, 3),
                new Rectangle(-6, -4, -4, 2));

        Test test = new Test();

        if (!test.doTest(picture)) {
            System.out.println("The program does not work.");
        } else {
            System.out.println("The program works correctly.");
            return;
        }

        System.out.print("Input х:");
        double x = readNumber();

        System.out.print("Input y:");
        double y = readNumber();

        printColorForPoint(x, y, picture);
    }

    public static double readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void printColorForPoint(double x, double y, Picture picture) {
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, picture.getColor(x, y));
    }
}
