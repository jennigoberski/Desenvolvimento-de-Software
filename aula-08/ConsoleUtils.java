import java.util.Scanner;

public class ConsoleUtils {
    public static int lerInteiro(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        String str = input.next();

        while (true) {
            try {
                int n = Integer.parseInt(str);
                return n;
            } catch (NumberFormatException e) {
                System.out.println("O valor digitado não é um número inteiro válido. Tente novamente.");
            } finally {
                input.close();
            }
        }

    }
}
