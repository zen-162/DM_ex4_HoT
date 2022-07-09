import java.util.Random;

class HeadsOrTails {
    public static void main(String[] args) {
        Random rd = new Random();
        final int n = 3;
        int contH = 0;
        int contT = 0;

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
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }

}
