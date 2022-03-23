public class Tabuada {
    public static void main(String[] args) {
        int result;

        System.out.println("-----Tabuada (1 até 10)-----");

        for(int i = 1; i <=10; i++){
            System.out.println("Tabuada do " + i);
            for(int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println(" ");
        }
    }
    
}
