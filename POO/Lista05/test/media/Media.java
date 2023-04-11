public class Media {
  public static double media(double[] valores){
    double soma = 0;
    for (double valor : valores) {
      soma += valor;
    }
    return soma / valores.length;
  }
}
