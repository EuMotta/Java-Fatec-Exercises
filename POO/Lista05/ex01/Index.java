public class Index {

  public static void main(String[] args) {
    Lampada lampada = new Lampada("LG", "LED", "Luminaria");

    if(lampada.isEstado()){
      System.out.println("Lâmpada acesa");
    }else{
      System.out.println("Lâmpada apagada");
    }

    lampada.acender();

    if(lampada.isEstado()){
      System.out.println("Lâmpada acesa");
    }else{
      System.out.println("Lâmpada apagada");
    }

    lampada.apagar();

    if(lampada.isEstado()){
      System.out.println("Lâmpada acesa");
    }else{
      System.out.println("Lâmpada apagada");
    }
  }
}
