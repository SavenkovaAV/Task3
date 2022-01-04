package src.ru.vsu.sc.savenkova_a_v;

public class Test {

    public static boolean doTest(Picture picture) {
        if (picture.getColor(-5, 1) != Enum.SimpleColor.GRAY) {
            System.out.println("Test 1 failed.");
            return false;
        } else if (picture.getColor(-1, 1)!= Enum.SimpleColor.GRAY) {
            System.out.println("Test 2 failed.");
            return false;
        } else if (picture.getColor(1,1)!= Enum.SimpleColor.YELLOW) {
            System.out.println("Test 3 failed.");
            return false;
        } else if (picture.getColor(1.5,-0.5)!= Enum.SimpleColor.YELLOW) {
            System.out.println("Test 4 failed.");
            return  false;
        } else if (picture.getColor(3,-5)!= Enum.SimpleColor.YELLOW) {
            System.out.println("Test 5 failed.");
            return false;
        } else if (picture.getColor(3,2)!= Enum.SimpleColor.WHITE) {
            System.out.println("Test 6 failed.");
            return false;
        } else if (picture.getColor(3,5)!= Enum.SimpleColor.GREEN){
            System.out.println("Test 7 failed.");
            return  false;
        } else if (picture.getColor(5,2)!= Enum.SimpleColor.BLUE){
            System.out.println("Test 8 failed.");
            return  false;
        } else if (picture.getColor(7,4)!= Enum.SimpleColor.BLUE){
            System.out.println("Test 9 failed.");
            return false;
        } else {
            return  true;
        }
    }

    public static void printPointsInEachArea(Picture picture) {
        printColorForPoint(-5, 1, picture);
        printColorForPoint(-1, 1, picture);
        printColorForPoint(1, 1, picture);
        printColorForPoint(1.5, -0.5, picture);
        printColorForPoint(3, -5, picture);
        printColorForPoint(3, 2, picture);
        printColorForPoint(3, 5, picture);
        printColorForPoint(5, 2, picture);
        printColorForPoint(7, 4, picture);
    }
}
