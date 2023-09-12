import java.util.Scanner;

public class Dateable {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = -1;
        while (age < 0) {
            try {
                age = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }


        System.out.println("You should date someone who is at least " + (age/2 +7));

        
    }
}
