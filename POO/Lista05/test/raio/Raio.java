public class Raio {
  private double raio;

  public Raio(double raio) {
    this.raio = raio;
  }

  public double calcularArea() {
    return Math.PI * raio * raio;
  }
}