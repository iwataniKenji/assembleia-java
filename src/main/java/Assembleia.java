// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public abstract class Assembleia {
  private int id;
  private String nomeDaEmpresa;
  private String nomeDoOperador;
  private Pauta pauta = new Pauta();

  // constructor
  public Assembleia() {
    id = 123;
    nomeDaEmpresa = "Nome Fantasia";
    nomeDoOperador = "Kenji Iwatani";
    pauta = new Pauta();
  }

  // constructor (polimorfismo por sobrecarga)
  public Assembleia(int id, String nomeDaEmpresa, String nomeDoOperador, Pauta pauta) {
    this.id = id;
    this.nomeDaEmpresa = nomeDaEmpresa;
    this.nomeDoOperador = nomeDoOperador;
    this.pauta = pauta;
  }

  // getters
  public Pauta getPauta(){
    return pauta;
  }
  public int getId() {
    return id;
  }
  public String getNomeDaEmpresa() {
    return nomeDaEmpresa;
  }
  public String getNomeDoOperador() {
    return nomeDoOperador;
  }

  // setters
  public void setPauta(Pauta pauta){
		this.pauta  = pauta;
	}
  public void setId(int id) throws NegativeNumberException {
    if (id >= 0) {
      this.id = id;
    } else {
      throw new NegativeNumberException();
    }
  }
  public void setNomeDaEmpresa(String nomeDaEmpresa) {
    this.nomeDaEmpresa = nomeDaEmpresa;
  }
  public void setNomeDoOperador(String nomeDoOperador) {
    this.nomeDoOperador = nomeDoOperador;
  }
}