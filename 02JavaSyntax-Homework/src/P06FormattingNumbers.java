import java.io.PrintStream;
import java.util.Scanner;
import java.lang.System;
/**
 * Created by irena on 30/10/2014.
 */
public class P06FormattingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = in.nextDouble();
        double c = in.nextDouble();
        String hex = Integer.toHexString(a).toUpperCase();
        String bin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f"+"|", hex, bin, b, c);
    }
}
