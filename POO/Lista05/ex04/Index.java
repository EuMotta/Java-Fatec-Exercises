import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int dia, mes, ano;
    System.out.println("Insira o dia: ");
    dia = num.nextInt();
    System.out.println("Insira o mes: ");
    mes = num.nextInt();
    System.out.println("Insira o ano: ");
    ano = num.nextInt();

    Data data = new Data();
    data.verificaData();
    data.setDia(dia);
    data.setMes(mes);
    data.setAno(ano);
    if (data.verificaData()) {

      System.out.println(data.getDia() + "/" + data.getMes() + "/" + data.getAno());
    } else {
      System.out.println("data invalida");
    }

  }
}
