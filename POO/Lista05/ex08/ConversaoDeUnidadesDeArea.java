public class ConversaoDeUnidadesDeArea {
  private double metro;
  private double pe;
  private double cm;
  private double milha;
  private double acre;

  public double getMetro() {
    return this.metro;
  }

  public void setMetro(double metro) {
    this.metro = metro;
  }

  public double getPe() {
    return this.pe;
  }

  public void setPe(double pe) {
    this.pe = pe;
  }

  public double getCm() {
    return this.cm;
  }

  public void setCm(double cm) {
    this.cm = cm;
  }

  public double getMilha() {
    return this.milha;
  }

  public void setMilha(double milha) {
    this.milha = milha;
  }

  public double getAcre() {
    return this.acre;
  }

  public void setAcre(double acre) {
    this.acre = acre;
  }

  public double metroParaPes(double valor) {
    return valor * 10.76;
}

public double pesParaCentimetros(double valor) {
    return valor * 929;
}

public double milhaParaAcre(double valor) {
    return valor * 640;
}

public double acreParaPesQuadrados(double valor) {
    return valor * 43560;
}
}
