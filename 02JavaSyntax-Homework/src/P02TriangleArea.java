import java.util.Scanner;

/**
 * Created by irena on 30/10/2014.
 */
public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ax = in.nextInt();
        int ay = in.nextInt();
        int bx = in.nextInt();
        int by = in.nextInt();
        int cx = in.nextInt();
        int cy = in.nextInt();

        int area = Math.abs(ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2;
        System.out.println(area);
    }
}
