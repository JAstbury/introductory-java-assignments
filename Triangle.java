/**
 * Created by jessastbury on 13/02/2017.
 */
public class Triangle {

    public void oneAsterisk() {
        System.out.println("*");
    }

    public void horizontalLine(int num) {
        for (int i=0; i<num; i++) {
            System.out.print("*");
        }
    }

    public void verticalLine(int num) {
        for (int i=0; i<num; i++) {
            System.out.println("*");
        }
    }

    public void rightTriangle(int num) {
        for (int i=0; i < num + 1; i++) {
            for (int x = 1; x <= i; x++){
                System.out.print("*");
            };
            System.out.println("");
        }
    }
}