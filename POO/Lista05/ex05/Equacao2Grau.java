public class Equacao2Grau {
  private double a;
  private double b;
  private double c;
  private double delta;

  public double getA() {
    return this.a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return this.b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public double getC() {
    return this.c;
  }

  public void setC(double c) {
    this.c = c;
  }

  public double getDelta() {
    return this.delta;
  }

  public void calculaDelta() {
    this.delta = this.b * this.b - 4 * this.a * this.c;
  }
}
