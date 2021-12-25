package src.ru.vsu.sc.savenkova_a_v;

public class Test {

    public boolean doTest(Picture picture) {
        if (picture.getColor(-5, 1) != Enum.SimpleColor.GRAY) {
            return false;
        } else if (picture.getColor(-1, 1)!= Enum.SimpleColor.GRAY) {
            return false;
        } else if (picture.getColor(1,1)!= Enum.SimpleColor.YELLOW) {
            return false;
        } else if (picture.getColor(1.5,-0.5)!= Enum.SimpleColor.YELLOW) {
            return  false;
        } else if (picture.getColor(3,-5)!= Enum.SimpleColor.YELLOW) {
            return false;
        } else if (picture.getColor(3,2)!= Enum.SimpleColor.WHITE) {
            return false;
        } else if (picture.getColor(3,5)!= Enum.SimpleColor.GREEN){
            return  false;
        } else if (picture.getColor(5,2)!= Enum.SimpleColor.BLUE){
            return  false;
        } else if (picture.getColor(7,4)!= Enum.SimpleColor.BLUE){
            return false;
        } else {
            return  true;
        }
    }
}
