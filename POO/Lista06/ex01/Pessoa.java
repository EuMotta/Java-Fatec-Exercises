public class Pessoa {
  private String nome = "José";
  private int idade = 23;
  private double altura = 1.89;
  private boolean fazAniversario;

  public boolean getFazAniversario() {
    return this.fazAniversario;
  }

  public void setFazAniversario(boolean fazAniversario) {
    this.fazAniversario = fazAniversario;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public boolean fazAniversario(boolean faz) {
    if (faz) {
      this.idade++;
      return true;
    }
    return false;
  }

}
