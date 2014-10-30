import java.util.Scanner;

/**
 * Created by irena on 30/10/2014.
 */
public class P08CountOfEqualBitPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String num = Integer.toBinaryString(a);
        int count=0;

        for (int i = 0; i < num.length()-1; i++) {
            if (num.charAt(i)==num.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}