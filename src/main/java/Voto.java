// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class Voto {
  private int qtdAprovar;
  private int qtdReprovar;
  private int qtdAbster;

  // constructor
  public Voto() {
    qtdAprovar = 10;
    qtdReprovar = 10;
    qtdAbster = 10;
  }

  // constructor (polimorfismo por sobrecarga)
  public Voto(int qtdAprovar, int qtdReprovar, int qtdAbster) {
    this.qtdAprovar = qtdAprovar;
    this.qtdReprovar = qtdReprovar;
    this.qtdAbster = qtdAbster;
  }

  // getters
  public int getQtdAprovar() {
    return qtdAprovar;
  }
  public int getQtdReprovar() {
    return qtdReprovar;
  }
  public int getQtdAbster() {
    return qtdAbster;
  }

  // setters
  public void setQtdAprovar(int qtdAprovar) {
    this.qtdAprovar = qtdAprovar;
  }
  public void setQtdReprovar(int qtdReprovar) {
    this.qtdReprovar = qtdReprovar;
  }
  public void setQtdAbster(int qtdAbster) {
    this.qtdAbster = qtdAbster;
  }
}