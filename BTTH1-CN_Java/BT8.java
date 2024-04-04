import java.util.Scanner;
import java.util.Random;

public class BT8 {
    public static void main(String[] args) {
        Scanner Bt8 = new Scanner(System.in);
        Random rand = new Random();
        int input_num = 0;
        int[] range = new int[2];
        range[0] = 0;
        System.out.println("GUESS NUMBER GAME");
        int n;
        do {
            System.out.print("Enter n (n > 0):");
            //Input the guess number
            n = Bt8.nextInt();
            System.out.println("\n");
        } while (n <= 0);
        //Randomly input random number
        int random_num = rand.nextInt(n + 1);
        range[1] = n;
        //Check number
        while (true) {
            System.out.print("Enter your guess number: ");
            System.out.print('\n');
            input_num = Bt8.nextInt();
            if (input_num == random_num) {
                System.out.println("Bingo.");
                break;
            }
            if (input_num > range[1] || input_num < range[0]) {
                System.out.println("Out of range. Try again?");
                System.out.println("(" + range[0] + ", " + range[1] + ")?");
                continue;
            }
            else if (input_num > random_num) {
                System.out.println("Too large.");
                range[1] = input_num - 1;
                System.out.println("(" + range[0] + ", " + range[1] + ")?");
            }
            else if (input_num < random_num) {
                System.out.println("Too small.");
                range[0] = input_num + 1;
                System.out.println("(" + range[0] + ", " + range[1] + ")?");
            }
            if (range[0] == range[1]) {
                System.out.println("You lost.");
                break;
            }
        }
        Bt8.close();
    }
}
