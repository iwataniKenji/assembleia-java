// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class Presencial extends Assembleia {
  private int codPresencial;
  private String endereco;

  // constructor
  public Presencial() {
    codPresencial = 123;
    endereco = "Rua Aleatoria Não Definida, Nº 1999";
  }

  // constructor (polimorfismo por sobrecarga)
  public Presencial(int codPresencial, String endereco) {
    this.codPresencial = codPresencial;
    this.endereco = endereco;
  }

  // getters
  public int getCodPresencial() {
    return codPresencial;
  }
  public String getEndereco() {
    return endereco;
  }

  // setters
  public void setCodPresencial(int codPresencial) {
    this.codPresencial = codPresencial;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
}