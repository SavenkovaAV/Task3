package src.ru.vsu.sc.savenkova_a_v.Figures;

public class Line {
    public double m;
    public double a;

    public Line(double m, double a) {
        this.m = m;
        this.a = a;
    }

    public boolean isPointAboveLine(double x, double y) {
        return y > a * x + m;
    }
}
