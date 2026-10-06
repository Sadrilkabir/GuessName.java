import java.util.Scanner;

public class GuessName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess my name (type stop to exit): ");
        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            if (name.equals("Olivia")) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }

            System.out.print("Guess my name (type stop to exit): ");
            name = scanner.nextLine();
        }

        System.out.println("Program ended.");

        scanner.close();
    }
}
