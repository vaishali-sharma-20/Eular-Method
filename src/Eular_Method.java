import java.lang.*;
import java.util.Scanner;
public class Eular_Method {
    static public float f(float x, float y) {
        return (x + y);
    }

    public static void main(String args[]) {
        float x0, y0, h, xf;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial point x0, y0, h, xf");
        x0 = sc.nextFloat();
        y0 = sc.nextFloat();
        h = sc.nextFloat();
        xf = sc.nextFloat();
        while (x0 <= xf) {
            System.out.println("x0 = " + x0 + "  y0 = " + y0);
            y0 = y0 + h * f(x0, y0);
            x0 = x0 + h;
        }
    }
}