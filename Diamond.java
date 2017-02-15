/**
 * Created by jessastbury on 15/02/2017.
 */
public class Diamond {

    public void isoscelesTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int x = i; x < num - 1; x++)
                System.out.print(" ");
            for (int y = 0; y < i * 2 + 1; y++)
                System.out.print("*");
            System.out.println("");
        }
    }

}