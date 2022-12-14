// NOME: KLEVERSON KENJI IWATANI
// CURSO: Análise e Desenvolvimento de Sistemas
// RA: 2465205

public class Presencial extends Assembleia implements Calc {
  private int codPresencial;
  private String endereco;
  private int capacidadePessoasSalao;

  // constructor
  public Presencial() {
    codPresencial = 123;
    endereco = "Rua Aleatoria Não Definida, Nº 1999";
    capacidadePessoasSalao = 100;
  }

  // constructor (polimorfismo por sobrecarga)
  public Presencial(int codPresencial, String endereco, int capacidadePessoasSalao) {
    this.codPresencial = codPresencial;
    this.endereco = endereco;
    this.capacidadePessoasSalao = capacidadePessoasSalao;
  }

  // getters
  public int getCodPresencial() {
    return codPresencial;
  }
  public String getEndereco() {
    return endereco;
  }
  public int getCapacidadePessoasSalao() {
    return capacidadePessoasSalao;
  }

  // setters
  public void setCodPresencial(int codPresencial) throws NegativeNumberException {
    if (codPresencial >= 0) {
      this.codPresencial = codPresencial;
    } else {
      throw new NegativeNumberException();
    }
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public void setCapacidadePessoasSalao(int capacidadePessoasSalao) {
    this.capacidadePessoasSalao = capacidadePessoasSalao;
  }

  // retorna quantidade de votos 'REPROVAR' + 'ABSTER'
  @Override
  public int countVotos() {
    int reprovar = getPauta().getVoto().getQtdReprovar();
    int abster = getPauta().getVoto().getQtdAbster();

    return reprovar + abster;
  }
}