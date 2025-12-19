import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Q1: 1 + 1 = ");
        if (sc.nextInt() == 2) {
            System.out.println("FLAG: hari");
        } else {
            System.out.println("Wrong answer");
        }

        System.out.print("Q2: 1 - 1 = ");
        if (sc.nextInt() == 0) {
            System.out.println("FLAG: kris");
        } else {
            System.out.println("Wrong answer");
        }

        System.out.print("Q3: 1 * 1 = ");
        if (sc.nextInt() == 1) {
            System.out.println("FLAG: mozhi");
        } else {
            System.out.println("Wrong answer");
        }

        System.out.print("Q4: 1 / 1 = ");
        if (sc.nextInt() == 1) {
            System.out.println("FLAG: varman");
        } else {
            System.out.println("Wrong answer");
        }

        sc.close();
    }
}
