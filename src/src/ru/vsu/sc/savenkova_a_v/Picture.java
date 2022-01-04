package src.ru.vsu.sc.savenkova_a_v;


import src.ru.vsu.sc.savenkova_a_v.Figures.Line;
import src.ru.vsu.sc.savenkova_a_v.Figures.Rectangle;

public class Picture {
    private final Line decreasingLine;
    private final Line increasingLine;
    private final Rectangle rightRectangle;
    private final Rectangle leftRectangle;

    public Picture(Line decreasingLine, Line increasingLine, Rectangle rightRectangle, Rectangle leftRectangle) {
        this.decreasingLine = decreasingLine;
        this.increasingLine = increasingLine;
        this.rightRectangle = rightRectangle;
        this.leftRectangle = leftRectangle;
    }

    public Enum.SimpleColor getColor(double x, double y) {
        if (leftRectangle.isPointInsideRectangle(x, y)) {
            return Enum.SimpleColor.GRAY;
        }
        if (rightRectangle.isPointInsideRectangle(x, y)) {
            if (!decreasingLine.isPointAboveLine(x, y)) {
                return Enum.SimpleColor.YELLOW;
            } else if (increasingLine.isPointAboveLine(x, y)) {
                return Enum.SimpleColor.WHITE;
            } else return Enum.SimpleColor.BLUE;
        } else if (decreasingLine.isPointAboveLine(x, y)) {
            if (increasingLine.isPointAboveLine(x, y)) {
                return Enum.SimpleColor.GREEN;
            } else return Enum.SimpleColor.BLUE;
        } else if (!increasingLine.isPointAboveLine(x, y)) {
            return Enum.SimpleColor.YELLOW;
        }
        return Enum.SimpleColor.GRAY;
    }
}
