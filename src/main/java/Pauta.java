// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class Pauta {
  private int ordem;
  private int chapa;
  private String tema;
  private Voto voto = new Voto();

  // constructor
  public Pauta() {
    ordem = 1;
    chapa = 1;
    tema = "Proponho aos acionistas a eleição da chapa 1 constituído por 10 membros";
    voto = new Voto();
  }

  // constructor (polimorfismo por sobrecarga)
  public Pauta(int ordem, int chapa, String tema, Voto voto) {
    this.ordem = ordem;
    this.chapa = chapa;
    this.tema = tema;
    this.voto = voto;
  }

  // getters
  public Voto getVoto(){
    return voto;
  }
  public int getOrdem() {
    return ordem;
  }
  public int getChapa() {
    return chapa;
  }
  public String getTema() {
    return tema;
  }

  // setters
  public void setVoto(Voto voto){
    this.voto  = voto;
  }
  public void setOrdem(int ordem) {
    this.ordem = ordem;
  }
  public void setChapa(int chapa) {
    this.chapa = chapa;
  }
  public void setTema(String tema) {
    this.tema = tema;
  }
}