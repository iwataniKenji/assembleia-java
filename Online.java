// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class Online extends Assembleia {
  private int codOnline;
  private String linkAcesso;
  private String plataformaUtilizada;

  // constructor
  public Online() {
    codOnline = 123;
    linkAcesso = "https://www.zoom.com.br/";
    plataformaUtilizada = "Zoom";
  }

  // constructor (polimorfismo por sobrecarga)
  public Online(int codOnline, String linkAcesso, String plataformaUtilizada) {
    this.codOnline = codOnline;
    this.linkAcesso = linkAcesso;
    this.plataformaUtilizada = plataformaUtilizada;
  }

  // getters
  public int getCodOnline() {
    return codOnline;
  }
  public String getLinkAcesso() {
    return linkAcesso;
  }
  public String getPlataformaUtilizada() {
    return plataformaUtilizada;
  }

  // setters
  public void setCodOnline(int codOnline) {
    this.codOnline = codOnline;
  }
  public void setLinkAcesso(String linkAcesso) {
    this.linkAcesso = linkAcesso;
  }
  public void setPlataformaUtilizada(String plataformaUtilizada) {
    this.plataformaUtilizada = plataformaUtilizada;
  }
}