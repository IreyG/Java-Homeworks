import java.util.Scanner;

/**
 * Created by irena on 30/10/2014.
 */
public class P09PointsInsideTheHouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double ax = 12.5;
        double ay = 8.5;
        double bx = 22.5;
        double by = 8.5;
        double cx = 17.5;
        double cy = 3.5;

        double abcArea = Math.abs(ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2;
        double pabArea = Math.abs(ax*(by-y)+bx*(y-ay)+x*(ay-by))/2;
        double pbcArea = Math.abs(x*(by-cy)+bx*(cy-y)+cx*(y-by))/2;
        double pacArea = Math.abs(ax*(y-cy)+x*(cy-ay)+cx*(ay-y))/2;

        boolean isInFirstSquare = (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5);
        boolean isInSecondSquare = (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5);
        boolean isInTriangle = pabArea+pbcArea+pacArea==abcArea;


        if (isInFirstSquare || isInSecondSquare || isInTriangle){
            System.out.println("Inside");
        }
        else{
            System.out.println("Outside");
        }
    }
}
