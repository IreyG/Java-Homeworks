import java.util.Scanner;

/**
 * Created by irena on 30/10/2014.
 */
public class P04TheSmallestOf3Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double small = a;
        if (a > b){
            small=b;
            if (b > c){
                small=c;
            }
        }
        System.out.println(small);
    }
}
