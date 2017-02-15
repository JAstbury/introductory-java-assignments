/**
 * Created by jessastbury on 15/02/2017.
 */
public class Diamond {

    public void isoscelesTriangle(int num) {
        for (int i = 0; i < num; i++) {
            printSpaces(num, i);
            printStars(i);
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

    public void reverseIsoscelesTriangle(int num) {
        for (int i = num - 1; i > 0; i--) {
            for (int x = i; x < num; x++)
                System.out.print(" ");
            for (int y = 1; y < i * 2; y++)
                System.out.print("*");
            System.out.println("");
        }
    }

    public void drawDiamond(int num) {
        isoscelesTriangle(num);
        reverseIsoscelesTriangle(num);
    }


}