public class Data {
  private int dia;
  private int mes;
  private int ano;

  public int getDia() {
  	return this.dia;
  }
  public void setDia(int dia) {
  	this.dia = dia;
  }


  public int getMes() {
  	return this.mes;
  }
  public void setMes(int mes) {
  	this.mes = mes;
  }


  public int getAno() {
  	return this.ano;
  }
  public void setAno(int ano) {
  	this.ano = ano;
  }


  public boolean verificaData() {
    int[] diasPorMes = {31,28,31,30,31,30,31,31,30,31,30,31};
    if (mes < 1 || mes > 12) {
      return false;
    }
    if (dia < 1 || dia > diasPorMes[mes - 1]) {
      return false;
    }

    if (mes == 2 && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
      return dia <= 29;
    }

    return true;
  }

}