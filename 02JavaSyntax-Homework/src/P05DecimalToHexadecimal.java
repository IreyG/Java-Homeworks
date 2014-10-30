import java.util.Scanner;

/**
 * Created by irena on 30/10/2014.
 */
public class P05DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dec = in.nextInt();
        String hex = Integer.toHexString(dec);
        System.out.println(hex.toUpperCase());
    }
}
