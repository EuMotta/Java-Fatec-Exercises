public class Numero {
  private int numero;

  public int getNumero(){
    return this.numero;
  }
  public void setNumero( int numero){
    this.numero = numero;
  }

  public int inverter() {
    int inverso = 0;
    while (this.numero != 0) {
        int digito = this.numero % 10;
        inverso = inverso * 10 + digito;
        this.numero /= 10;
    }
    return inverso;
}
}