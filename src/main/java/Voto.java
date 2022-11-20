// NOME: KLEVERSON KENJI IWATANI
// CURSO: Análise e Desenvolvimento de Sistemas
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
  public void setQtdAprovar(int qtdAprovar) throws NegativeNumberException {
    if (qtdAprovar >= 0) {
      this.qtdAprovar = qtdAprovar;
    } else {
      throw new NegativeNumberException();
    }
  }
  public void setQtdReprovar(int qtdReprovar) throws NegativeNumberException {
    if (qtdReprovar >= 0) {
      this.qtdReprovar = qtdReprovar;
    } else {
      throw new NegativeNumberException();
    }
  }
  public void setQtdAbster(int qtdAbster) throws NegativeNumberException {
    if (qtdAbster >= 0) {
      this.qtdAbster = qtdAbster;
    } else {
      throw new NegativeNumberException();
    }
  }
}