public class Pessoa {
  int quantidade;
  int valor;
  boolean garcom;

  public int getQuantidade() {
  	return this.quantidade;
  }
  public void setQuantidade(int quantidade) {
  	this.quantidade = quantidade;
  }


  public int getValor() {
  	return this.valor;
  }
  public void setValor(int valor) {
  	this.valor = valor;
  }


  public boolean getGarcom() {
  	return this.garcom;
  }
  public void setGarcom(boolean garcom) {
  	this.garcom = garcom;
  }


  public double pagarConta( boolean garcom, int valor, int quantidade){
    double pagarGarcom;
    double resultado;
    if(garcom){
      pagarGarcom =  ((valor *10) /100) / quantidade;
      resultado = (valor / quantidade) + pagarGarcom;
    }else{
      resultado = valor / quantidade;
    }
    return resultado;
  }
}
