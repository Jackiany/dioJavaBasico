import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String input = scanner.nextLine();

        System.out.println("Você digitou a palavra: " + input);
        scanner.close();
    }
}
