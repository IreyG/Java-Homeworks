import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by irena on 28/10/2014.
 */
public class P08SortArrayofStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] towns = new String[n];

        for (int i = 0; i < n; i++) {
            String town = in.next();
            towns[i] = town;
        }
        Arrays.sort(towns);
        for (int i = 0; i < towns.length; i++) {
            System.out.println(towns[i]);
        }
    }
}
