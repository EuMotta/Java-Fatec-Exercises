import java.util.Date;

public class Data {
  private int dia;
  private int mes;
  private int ano;
  private Date data1;
  private Date data2;

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }


  public void setData1(Date data1) {
    this.data1 = data1;
  }

  public void setData2(Date data2) {
    this.data2 = data2;
  }

  public Date getData1() {
    return data1;
  }

  public Date getData2() {
    return data2;
  }



  public boolean saoIguais() {
    return this.data1.equals(data2);
  }

  public Date dataMaior() {
    return this.data1.after(data2) ? this.data1 : data2;
  }

  public Date dataMenor() {
    return this.data1.before(data2) ? this.data1 : data2;
  }

  public long diferencaEmDias() {
    long diferencaM = Math.abs(this.data1.getTime() - data2.getTime());
    long diferencaDias = diferencaM / (24 * 60 * 60 * 1000);

    return diferencaDias;
  }
  public String toString() {
    return String.format("%02d/%02d/%04d", dia, mes, ano);
}

  public boolean verificaData() {
    int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    if (mes < 1 || mes > 12) {
      return false;
    }
    if (dia < 1 || dia > diasPorMes[mes - 1]) {
      return false;
    }

    boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

    if (mes == 2 && bissexto && dia > 29) {
      return false;
    } else if (mes == 2 && !bissexto && dia > 28) {
      return false;
    }

    return true;
  }

}
