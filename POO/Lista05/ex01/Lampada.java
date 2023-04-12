public class Lampada {
  private String marca;
  private String modelo;
  private String tipo;
  private boolean estado;

  public Lampada(String marca, String modelo, String tipo) {
    this.marca = marca;
    this.modelo = modelo;
    this.tipo = tipo;
    this.estado = false;
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

  public boolean isEstado() {
    return estado;
  }

  public void acender() {
    this.estado = true;
  }

  public void apagar() {
    this.estado = false;
  }
}
