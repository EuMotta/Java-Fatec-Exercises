public class Index {

  public static void main(String[] args) {
    Lampada lampada = new Lampada("LG", "LED", "Luminaria");

    lampada.acender();

    if(lampada.isEstado() == 1){
      System.out.println("Lâmpada acesa");
    }else{
      System.out.println("Lâmpada apagada");
    }

    lampada.meioAcesa();

    if(lampada.isEstado() == 2){
      System.out.println("Lâmpada meio acesa");
    }else{
      System.out.println("Lâmpada apagada");
    }

    lampada.apagar();

    if(lampada.isEstado() == 3){
      System.out.println("Lâmpada apagada");
    }else{
      System.out.println("Lâmpada acesa");
    }
  }
}
