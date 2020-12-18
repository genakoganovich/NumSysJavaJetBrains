package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static void stageOne() {
        System.out.println("10 = 0b1010");
    }

    public static void stageTwo() {
        System.out.println(new java.util.Scanner(System.in).nextInt() % 8);
    }

    public static void stageThree() {
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        int radix = scanner.nextInt();
        if (radix == 2) {
            System.out.println("0b" + Long.toString(value, radix));
        } else if (radix == 8) {
            System.out.println("0" + Long.toString(value, radix));
        } else if (radix == 16) {
            System.out.println("0x" + Long.toString(value, radix));
        }
    }
}
