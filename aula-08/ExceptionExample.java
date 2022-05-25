public class ExceptionExample {
    public static void main(String[] args) {
        int num = ConsoleUtils.lerInteiro("Informe um número inteiro: \n");
        try {
            int fat = Fatorial.calcular(num);
            System.out.printf("O fatorial de %d é %d \n", num, fat);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
            
    }
}