public class Lampada {
  private String marca;
  private String modelo;
  private String tipo;
  private int estado;

  public Lampada(String marca, String modelo, String tipo) {
    this.marca = marca;
    this.modelo = modelo;
    this.tipo = tipo;
    this.estado = 0;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
}

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int isEstado() {
    return estado;
  }

  public void acender() {
    this.estado = 1;
  }
  public void meioAcesa() {
    this.estado = 2;
  }

  public void apagar() {
    this.estado = 3;
  }
}
