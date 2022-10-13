// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class TstAssembleia {
  static Leitura leitura = new Leitura();
  static int option = 0;

  public static void registerAssembleia() {
    Assembleia assembleia = new Assembleia();

    assembleia.setId(Integer.parseInt(leitura.dataInput("\nDigite o ID: ")));
    assembleia.setNomeDaEmpresa(leitura.dataInput("\nDigite o nome da empresa: "));
    assembleia.setNomeDoOperador(leitura.dataInput("\nDigite o nome do operador da assembleia: "));

    System.out.println("\nDADOS DA ASSEMBLEIA PADRÃO:");
    System.out.println("ID..............: " +assembleia.getId());
    System.out.println("NOME DA EMPRESA.: " +assembleia.getNomeDaEmpresa());
    System.out.println("NOME DO OPERADOR: " +assembleia.getNomeDoOperador());
  }

  public static void registerPresencial() {
    Presencial assPresencial = new Presencial();

    assPresencial.setId(Integer.parseInt(leitura.dataInput("\nDigite o ID: ")));
    assPresencial.setNomeDaEmpresa(leitura.dataInput("\nDigite o nome da empresa: "));
    assPresencial.setNomeDoOperador(leitura.dataInput("\nDigite o nome do operador da assembleia: "));
    assPresencial.setCodPresencial(Integer.parseInt(leitura.dataInput("\nDigite o codigo da assembleia: ")));
    assPresencial.setEndereco(leitura.dataInput("\nDigite o endereço do evento: "));

    System.out.println("\nDADOS DA ASSEMBLEIA PRESENCIAL:");
    System.out.println("ID...............: " +assPresencial.getId());
    System.out.println("NOME DA EMPRESA..: " +assPresencial.getNomeDaEmpresa());
    System.out.println("NOME DO OPERADOR.: " +assPresencial.getNomeDoOperador());
    System.out.println("CODIGO PRESENCIAL: " +assPresencial.getCodPresencial());
    System.out.println("ENDERECO.........: " +assPresencial.getEndereco());
  }

  public static void registerOnline() {
    Online assOnline = new Online();

    assOnline.setId(Integer.parseInt(leitura.dataInput("\nDigite o ID: ")));
    assOnline.setNomeDaEmpresa(leitura.dataInput("\nDigite o nome da empresa: "));
    assOnline.setNomeDoOperador(leitura.dataInput("\nDigite o nome do operador da assembleia: "));
    assOnline.setCodOnline(Integer.parseInt(leitura.dataInput("\nDigite o codigo da assembleia: ")));
    assOnline.setLinkAcesso(leitura.dataInput("\nDigite o link da chamada: "));

    System.out.println("\nDADOS DA ASSEMBLEIA ONLINE:");
    System.out.println("ID...............: " +assOnline.getId());
    System.out.println("NOME DA EMPRESA..: " +assOnline.getNomeDaEmpresa());
    System.out.println("NOME DO OPERADOR.: " +assOnline.getNomeDoOperador());
    System.out.println("CODIGO ONLINE....: " +assOnline.getCodOnline());
    System.out.println("LINK DE ACESSO...: " +assOnline.getLinkAcesso());
  }

  public static void main(String arg[]) {
    // menu de cadastro
    System.out.println("DIGITE O TIPO DE ASSEMBLEIA QUE DESEJA CADASTRAR:");
    System.out.println("1 - SEM CONFIGURAÇÃO");
    System.out.println("2 - PRESENCIAL");
    System.out.println("3 - ONLINE");

    option = Integer.parseInt(leitura.dataInput("\nOPCAO: "));

    while (option != 1 && option != 2 && option != 3) {
      option = Integer.parseInt(leitura.dataInput("\nInforme o código do tipo de assembleia desejada: "));

      if (option != 1 && option != 2 && option != 3) {
        System.out.println("\nCódigo incorreto. Tente novamente.");
      }
    }

    switch(option) {
      case 1:
        registerAssembleia();
        break;
      case 2:
        registerPresencial();
        break;
      case 3:
        registerOnline();
        break;
      default:
        System.out.println("Erro na aplicação. Por favor contacte o suporte.");
        break;
    }    

    System.out.println("\nFIM DO PROGRAMA");
  }
}