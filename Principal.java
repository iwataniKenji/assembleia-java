// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class Principal {
  static Leitura leitura = new Leitura();
  static int option = 0;
  static boolean proceed = true;

  public static void registerPresencial() {
    Presencial assPresencial = new Presencial();

    while (proceed) {
      try {
        // da classe assembleia  
        assPresencial.setId(Integer.parseInt(leitura.dataInput("\nDigite o ID: ")));
        assPresencial.setNomeDaEmpresa(leitura.dataInput("\nDigite o nome da empresa: "));
        assPresencial.setNomeDoOperador(leitura.dataInput("\nDigite o nome do operador da assembleia: "));

        // da classe presencial
        assPresencial.setCodPresencial(Integer.parseInt(leitura.dataInput("\nDigite o codigo da assembleia: ")));
        assPresencial.setEndereco(leitura.dataInput("\nDigite o endereço do evento: "));
        assPresencial.setCapacidadePessoasSalao(Integer.parseInt(leitura.dataInput("\nDigite a capacidade de pessoas no salão: ")));

        // da classe pauta
        assPresencial.getPauta().setOrdem(Integer.parseInt(leitura.dataInput("\nDigite a ordem da pauta: ")));
        assPresencial.getPauta().setChapa(Integer.parseInt(leitura.dataInput("\nDigite a chapa: ")));
        assPresencial.getPauta().setTema(leitura.dataInput("\nDigite o tema: "));

        // da classe voto
        assPresencial.getPauta().getVoto().setQtdAprovar(Integer.parseInt(leitura.dataInput("\nDigite a quantidade de votos 'APROVAR': ")));
        assPresencial.getPauta().getVoto().setQtdReprovar(Integer.parseInt(leitura.dataInput("\nDigite a quantidade de votos 'REPROVAR': ")));
        assPresencial.getPauta().getVoto().setQtdAbster(Integer.parseInt(leitura.dataInput("\nDigite a quantidade de votos 'ABSTENCAO': ")));

        proceed = false;
      } catch (NegativeNumberException exception) {
        exception.printNegativeNumber();
      }
    }
    
    System.out.println("\nDADOS DA ASSEMBLEIA PRESENCIAL:");
    System.out.println("ID...............: " +assPresencial.getId());
    System.out.println("NOME DA EMPRESA..: " +assPresencial.getNomeDaEmpresa());
    System.out.println("NOME DO OPERADOR.: " +assPresencial.getNomeDoOperador());
    System.out.println("CODIGO PRESENCIAL: " +assPresencial.getCodPresencial());
    System.out.println("ENDERECO.........: " +assPresencial.getEndereco());
    System.out.println("CAPACIDADE SALAO.: " +assPresencial.getCapacidadePessoasSalao());
    System.out.println("\nDADOS DA PAUTA:");
    System.out.println("ORDEM DA PAUTA...: " +assPresencial.getPauta().getOrdem());
    System.out.println("CHAPA............: " +assPresencial.getPauta().getChapa());
    System.out.println("TEMA.............: " +assPresencial.getPauta().getTema());
    System.out.println("\nQUANTIDADE DE VOTOS:");
    System.out.println("VOTOS APROVAR....: " +assPresencial.getPauta().getVoto().getQtdAprovar());
    System.out.println("VOTOS REPROVAR...: " +assPresencial.getPauta().getVoto().getQtdReprovar());
    System.out.println("VOTOS ABSTENCAO..: " +assPresencial.getPauta().getVoto().getQtdAbster());

    System.out.println("SOMA DE VOTOS REPROVAR E ABSTER-SE É DE: " + assPresencial.countVotos());
  }

  public static void registerOnline() {
    Online assOnline = new Online();

    while (proceed) {
      try {
        // da classe assembleia
        assOnline.setId(Integer.parseInt(leitura.dataInput("\nDigite o ID: ")));
        assOnline.setNomeDaEmpresa(leitura.dataInput("\nDigite o nome da empresa: "));
        assOnline.setNomeDoOperador(leitura.dataInput("\nDigite o nome do operador da assembleia: "));

        // da classe online
        assOnline.setCodOnline(Integer.parseInt(leitura.dataInput("\nDigite o codigo da assembleia: ")));
        assOnline.setLinkAcesso(leitura.dataInput("\nDigite o link da chamada: "));
        assOnline.setPlataformaUtilizada(leitura.dataInput("\nDigite a plataforma utilizada: "));

        // da classe pauta
        assOnline.getPauta().setOrdem(Integer.parseInt(leitura.dataInput("\nDigite a ordem da pauta: ")));
        assOnline.getPauta().setChapa(Integer.parseInt(leitura.dataInput("\nDigite a chapa: ")));
        assOnline.getPauta().setTema(leitura.dataInput("\nDigite o tema: "));

        // da classe voto
        assOnline.getPauta().getVoto().setQtdAprovar(Integer.parseInt(leitura.dataInput("\nDigite a quantidade de votos 'APROVAR': ")));
        assOnline.getPauta().getVoto().setQtdReprovar(Integer.parseInt(leitura.dataInput("\nDigite a quantidade de votos 'REPROVAR': ")));
        assOnline.getPauta().getVoto().setQtdAbster(Integer.parseInt(leitura.dataInput("\nDigite a quantidade de votos 'ABSTENCAO': ")));

        proceed = false;
      } catch (NegativeNumberException exception) {
        exception.printNegativeNumber();
      }
    }

    System.out.println("\nDADOS DA ASSEMBLEIA ONLINE:");
    System.out.println("ID...............: " +assOnline.getId());
    System.out.println("NOME DA EMPRESA..: " +assOnline.getNomeDaEmpresa());
    System.out.println("NOME DO OPERADOR.: " +assOnline.getNomeDoOperador());
    System.out.println("CODIGO ONLINE....: " +assOnline.getCodOnline());
    System.out.println("LINK DE ACESSO...: " +assOnline.getLinkAcesso());
    System.out.println("PLATAFORMA.......: " +assOnline.getPlataformaUtilizada());
    System.out.println("\nDADOS DA PAUTA:");
    System.out.println("ORDEM DA PAUTA...: " +assOnline.getPauta().getOrdem());
    System.out.println("CHAPA............: " +assOnline.getPauta().getChapa());
    System.out.println("TEMA.............: " +assOnline.getPauta().getTema());
    System.out.println("\nQUANTIDADE DE VOTOS:");
    System.out.println("VOTOS APROVAR....: " +assOnline.getPauta().getVoto().getQtdAprovar());
    System.out.println("VOTOS REPROVAR...: " +assOnline.getPauta().getVoto().getQtdReprovar());
    System.out.println("VOTOS ABSTENCAO..: " +assOnline.getPauta().getVoto().getQtdAbster());

    System.out.println("SOMA DOS VOTOS APROVAR E REPROVAR É DE: " + assOnline.countVotos());
  }

  public static void registerHibrida() {
    Hibrida assHibrida = new Hibrida();

    while (proceed) {
      try {
        // da classe assembleia
        assHibrida.setId(Integer.parseInt(leitura.dataInput("\nDigite o ID: ")));
        assHibrida.setNomeDaEmpresa(leitura.dataInput("\nDigite o nome da empresa: "));
        assHibrida.setNomeDoOperador(leitura.dataInput("\nDigite o nome do operador da assembleia: "));

        // da classe hibrida
        assHibrida.setCodHibrida(Integer.parseInt(leitura.dataInput("\nDigite o codigo da assembleia hibrida: ")));
        assHibrida.setEndereco(leitura.dataInput("\nDigite o endereço do evento: "));
        assHibrida.setLinkAcesso(leitura.dataInput("\nDigite o link da chamada: "));

        // da classe pauta
        assHibrida.getPauta().setOrdem(Integer.parseInt(leitura.dataInput("\nDigite a ordem da pauta: ")));
        assHibrida.getPauta().setChapa(Integer.parseInt(leitura.dataInput("\nDigite a chapa: ")));
        assHibrida.getPauta().setTema(leitura.dataInput("\nDigite o tema: "));

        // da classe voto
        assHibrida.getPauta().getVoto().setQtdAprovar(Integer.parseInt(leitura.dataInput("\nDigite a quantidade de votos 'APROVAR': ")));
        assHibrida.getPauta().getVoto().setQtdReprovar(Integer.parseInt(leitura.dataInput("\nDigite a quantidade de votos 'REPROVAR': ")));
        assHibrida.getPauta().getVoto().setQtdAbster(Integer.parseInt(leitura.dataInput("\nDigite a quantidade de votos 'ABSTENCAO': ")));

        proceed = false;
      } catch (NegativeNumberException exception) {
        exception.printNegativeNumber();
      }
    }

    System.out.println("\nDADOS DA ASSEMBLEIA HÍBRIDA:");
    System.out.println("ID..............: " +assHibrida.getId());
    System.out.println("NOME DA EMPRESA.: " +assHibrida.getNomeDaEmpresa());
    System.out.println("NOME DO OPERADOR: " +assHibrida.getNomeDoOperador());
    System.out.println("CODIGO HIBRIDA..: " +assHibrida.getCodHibrida());
    System.out.println("ENDERECO........: " +assHibrida.getEndereco());
    System.out.println("LINK DE ACESSO..: " +assHibrida.getLinkAcesso());
    System.out.println("\nDADOS DA PAUTA:");
    System.out.println("ORDEM DA PAUTA...: " +assHibrida.getPauta().getOrdem());
    System.out.println("CHAPA............: " +assHibrida.getPauta().getChapa());
    System.out.println("TEMA.............: " +assHibrida.getPauta().getTema());
    System.out.println("\nQUANTIDADE DE VOTOS:");
    System.out.println("VOTOS APROVAR....: " +assHibrida.getPauta().getVoto().getQtdAprovar());
    System.out.println("VOTOS REPROVAR...: " +assHibrida.getPauta().getVoto().getQtdReprovar());
    System.out.println("VOTOS ABSTENCAO..: " +assHibrida.getPauta().getVoto().getQtdAbster());

    System.out.println("SOMA DOS VOTOS APROVAR E ABSTER-SE É DE: " + assHibrida.countVotos());
  }

  public static void main(String arg[]) {    
    // menu de cadastro
    System.out.println("MENU:");
    System.out.println("1 - PRESENCIAL");
    System.out.println("2 - ONLINE");
    System.out.println("3 - HÍBRIDA");

    option = 0;

    while (option != 1 && option != 2 && option != 3) {
      option = Integer.parseInt(leitura.dataInput("\nDIGITE O TIPO DE ASSEMBLEIA QUE DESEJA CADASTRAR: "));

      if (option != 1 && option != 2 && option != 3) {
        System.out.println("\nCÓDIGO INCORRETO. TENTE NOVAMENTE.");
      }
    }

    switch(option) {
      case 1:
        registerPresencial();
        break;
      case 2:
        registerOnline();
        break;
      case 3:
        registerHibrida();
        break;
      default:
        System.out.println("Erro na aplicação. Por favor contacte o suporte.");
        break;
    }    

    System.out.println("\nFIM DO PROGRAMA");
  }
}