package src.ru.vsu.sc.savenkova_a_v;


import src.ru.vsu.sc.savenkova_a_v.Figures.Line;
import src.ru.vsu.sc.savenkova_a_v.Figures.Rectangle;

public class Picture {
    private final Line L1;
    private final Line L2;
    private final Rectangle R1;
    private final Rectangle R2;

    public Picture(Line L1, Line L2, Rectangle R1, Rectangle R2) {
        this.L1 = L1;
        this.L2 = L2;
        this.R1 = R1;
        this.R2 = R2;
    }

    public Enum.SimpleColor getColor(double x, double y) {
        if (R2.isPointInsideRectangle(x, y)) {
            return Enum.SimpleColor.GRAY;
        }
        if (R1.isPointInsideRectangle(x, y)) {
            if (!L1.isPointAboveLine(x, y)) {
                return Enum.SimpleColor.YELLOW;
            } else if (L2.isPointAboveLine(x, y)) {
                return Enum.SimpleColor.WHITE;
            } else return Enum.SimpleColor.BLUE;
        } else if (L1.isPointAboveLine(x, y)) {
            if (L2.isPointAboveLine(x, y)) {
                return Enum.SimpleColor.GREEN;
            } else return Enum.SimpleColor.BLUE;
        } else if (!L2.isPointAboveLine(x, y)) {
            return Enum.SimpleColor.YELLOW;
        }
        return Enum.SimpleColor.GRAY;
    }
}
