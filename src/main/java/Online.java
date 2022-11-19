// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class Online extends Assembleia {
  private int codOnline;
  private String linkAcesso;

  // constructor
  public Online() {
    codOnline = 123;
    linkAcesso = "https://www.zoom.com.br/";
  }

  // constructor (polimorfismo por sobrecarga)
  public Online(int codOnline, String linkAcesso) {
    this.codOnline = codOnline;
    this.linkAcesso = linkAcesso;
  }

  // getters
  public int getCodOnline() {
    return codOnline;
  }
  public String getLinkAcesso() {
    return linkAcesso;
  }

  // setters
  public void setCodOnline(int codOnline) {
    this.codOnline = codOnline;
  }
  public void setLinkAcesso(String linkAcesso) {
    this.linkAcesso = linkAcesso;
  }
}