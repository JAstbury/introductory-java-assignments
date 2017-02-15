/**
 * Created by jessastbury on 15/02/2017.
 */
public class Diamond {

    public void isoscelesTriangle(int num, boolean diamond) {
        int lines = diamond ? num - 1 : num;
        for (int i = 0; i < lines; i++) {
            printSpaces(num, i);
            printStars(i);
            System.out.println("");
        }
    }

    public void reverseIsoscelesTriangle(int num, boolean diamond) {
        int lines = diamond ? num - 1 : num;
        for (int i = lines; i > 0; i--) {
            printSpaces(num + 1, i);
            printStars(i - 1);
            System.out.println("");
        }
    }

    public void printSpaces(int size, int line) {
        for (int x = line; x < size - 1; x++)
            System.out.print(" ");
    }

    public void printStars(int line) {
        for (int x = 0; x < line * 2 + 1; x++)
            System.out.print("*");
    }

    public void middleLine(int size) {
        printStars(size - 1);
        System.out.println();
    }

    public void drawDiamond(int num) {
        isoscelesTriangle(num, true);
        middleLine(num);
        reverseIsoscelesTriangle(num, true);
    }

    public void drawDiamondName(int num, String name) {
        isoscelesTriangle(num, true );
        System.out.println(name);
        reverseIsoscelesTriangle(num, true);
    }


}