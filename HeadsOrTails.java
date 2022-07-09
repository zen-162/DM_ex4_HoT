import java.util.Random;
import java.util.Scanner;

class HeadsOrTails {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        final int n = 3;
        int contH = 0;
        int contT = 0;

        // user_name
        System.out.println("Who are you?");
        String name = sc.next();
        System.out.println("hello, " + name + "!");

        System.out.println("Tossing a coin...");
        for (int i = 0; i < n; i++) {
            System.out.print("Round " + (i + 1) + ": ");
            int random = rd.nextInt(2);
            if (random == 0) {
                System.out.println("Heads");
                contH++;
            } else if (random == 1) {
                System.out.println("Tails");
                contT++;
            }
        }
        System.out.println("Heads: " + contH + ", Tails: " + contT);
        if (contH > contT) {
            System.out.println(name+" won!");
        } else {
            System.out.println(name+" lost!");
        }
    }
}
