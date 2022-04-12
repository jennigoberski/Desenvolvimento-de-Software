public class Pontos {

    private double x;
    private double y;

    public Pontos() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Pontos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void setX(double x) {
        this.x = x;
    }

    double getX() {
        return this.x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getY() {
        return y;
    }

    double distancia() {
        double distancia = Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.y - 0, 2));
        return distancia;
    }

    double distancia(Pontos pt) {
        double distancia = Math.sqrt(Math.pow(pt.getX() - this.x, 2) + Math.pow(pt.getY() - this.y, 2));
        return distancia;
    }

    public String toString() {
        return "X: " + this.x +
                "\nY: " + this.y + 
                "\n  ";
    }
    /*
     * distância entre dois pontos:
     * d = Raia quadrada de de (x1-x0)^2 + (y1-y0)^2
     * 
     * p2.distancia() -> calcula a distancia de p2 até a origem
     */
}
