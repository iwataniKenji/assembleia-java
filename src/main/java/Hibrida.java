// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class Hibrida extends Assembleia implements Calc {
  private int codHibrida;
  private String endereco;
  private String linkAcesso;

  // constructor
  public Hibrida() {
    codHibrida = 123;
    endereco = "Rua Aleatoria Não Definida, Nº 1999";
    linkAcesso = "https://www.zoom.com.br/";
  }

  // constructor (polimorfismo por sobrecarga)
  public Hibrida(int codHibrida, String endereco, String linkAcesso) {
    this.codHibrida = codHibrida;
    this.endereco = endereco;
    this.linkAcesso = linkAcesso;
  }

  // getters
  public int getCodHibrida() {
    return codHibrida;
  }
  public String getEndereco() {
    return endereco;
  }
  public String getLinkAcesso() {
    return linkAcesso;
  }

  // setters
  public void setCodHibrida(int codHibrida) throws NegativeNumberException{
    if (codHibrida >= 0) {
      this.codHibrida = codHibrida;
    } else {
      throw new NegativeNumberException();
    }
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public void setLinkAcesso(String linkAcesso) {
    this.linkAcesso = linkAcesso;
  }

  // retorna quantidade de votos 'APROVAR' + 'ABSTER'
  public int countVotos() {
    int aprovar = getPauta().getVoto().getQtdAprovar();
    int abster = getPauta().getVoto().getQtdAbster();

    return aprovar + abster;
  }
}
