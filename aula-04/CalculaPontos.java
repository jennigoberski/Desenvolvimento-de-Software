public class CalculaPontos {

    public static void main(String[] args) {
        
        Pontos pt1 = new Pontos();
        Pontos pt2 = new Pontos(5.0, 10.0);
        Pontos pt3 = new Pontos(7.0, 10.0);

        System.out.printf("Ponto 1:\n%s\n", pt1.toString());
        System.out.printf("Ponto 2:\n%s\n", pt2.toString());
        System.out.printf("Ponto 3:\n%s\n", pt3.toString());
        
        System.out.println("Distância entre ponto 1 e origem: " + pt1.distancia());
        System.out.printf("Distância entre ponto 1 e ponto 2: %.4f", pt1.distancia(pt2));
        System.out.printf("\nDistância entre ponto 2 e ponto 3: %.4f", pt2.distancia(pt3));


    }
}
