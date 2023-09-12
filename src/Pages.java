import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = -1;
        while (age < 0 || age > 140) {
            try {
                age = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }


        if ((100 - age) > 1) {
            System.out.println("You need to read at least " + (100 - age) + " pages before you give up a book");
        }
        else {
            System.out.println("You need to read at least " + (1) + " page before you give up a book");
        }


    }
}
