import java.util.Scanner;

public class GuessName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess my name: ");
        String name = scanner.nextLine();

        if (name.equals("Olivia")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }

        scanner.close();
    }
}
