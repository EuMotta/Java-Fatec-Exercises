import java.util.Scanner;

public class Index {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    Ano ano = new Ano();

    System.out.print("Digite um ano: ");
    ano.setAno(num.nextInt());

    ano.ehBissexto();

    if(ano.ehBissexto() == true){
      System.out.println("O ano é bissexto.");
    }else{
      System.out.println("O ano não é bissexto.");
    }
    
  }
}
