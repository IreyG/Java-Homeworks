import java.util.Scanner;

/**
 * Created by irena on 30/10/2014.
 */
public class P03PointsInsideAFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ax = in.nextDouble();
        double ay = in.nextDouble();

        if (ax >= 12.5 && ax <= 17.5 && ay >= 6 && ay <= 13.5){
            System.out.println("Inside");
        }
        else if ( ax >=17.5 && ax <= 20 && ay >= 6 && ay <= 8.5 ){
            System.out.println("Inside");
        }
        else if ( ax >= 20 && ax <= 22.5 && ay >= 6 && ay <= 13.5){
            System.out.println("Inside");
        }
        else{
            System.out.println("Outside");
        }
    }
}
