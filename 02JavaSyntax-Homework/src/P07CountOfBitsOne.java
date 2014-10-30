import java.util.Scanner;

/**
 * Created by irena on 30/10/2014.
 */
public class P07CountOfBitsOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String num = String.format("%16s", Integer.toBinaryString(a)).replace(' ', '0');
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
