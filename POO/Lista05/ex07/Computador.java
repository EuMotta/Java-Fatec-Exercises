public class Computador {
  private int placaMae;
  private int processador;
  private int memoria;
  private int discoRigido;
  private int monitor;
  private int option;

  public int getOption() {
  	return this.option;
  }
  public void setOption(int option) {
  	this.option = option;
  }
  
  public int getPlacaMae() {
  	return this.placaMae;
  }
  public void setPlacaMae(int placaMae) {
  	this.placaMae = placaMae;
  }


  public int getProcessador() {
  	return this.processador;
  }
  public void setProcessador(int processador) {
  	this.processador = processador;
  }


  public int getMemoria() {
  	return this.memoria;
  }
  public void setMemoria(int memoria) {
  	this.memoria = memoria;
  }


  public int getDiscoRigido() {
  	return this.discoRigido;
  }
  public void setDiscoRigido(int discoRigido) {
  	this.discoRigido = discoRigido;
  }


  public int getMonitor() {
  	return this.monitor;
  }
  public void setMonitor(int monitor) {
  	this.monitor = monitor;
  }


  public int calcularValor(){
    int total = this.placaMae + this.monitor + this.processador + this.memoria + this.discoRigido;
    return total;
  }
}