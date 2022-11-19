// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerAssembleia {

    private Assembleia assembleia;
    private List<Assembleia> bdAssembleia = new ArrayList<Assembleia>();

    // singleton
    private static GerAssembleia gerAssembleiaUnica;

    private GerAssembleia(){

    }

    public static GerAssembleia getGerAssembleia(){
        if(gerAssembleiaUnica == null){
            gerAssembleiaUnica = new GerAssembleia();
        }    

        return gerAssembleiaUnica;
    }

    public List<Assembleia> getBdAssembleia(){
        return bdAssembleia;
    }

    // cadastro
    public Assembleia cadPes(Assembleia assembleia){
        if (consAssembleiaCod(assembleia)== null) {
            bdAssembleia.add(assembleia);
            return assembleia;
        } else {
            return null;
        }
    }

    // consulta
    public Assembleia consAssembleiaCod(Assembleia assembleia){
        for(int i = 0; i < bdAssembleia.size(); i++){
            if(assembleia.getId() == bdAssembleia.get(i).getId()){
                return bdAssembleia.get(i);
            }
        }
        return null;
    }

    public Assembleia removeAssembleiaCod(Assembleia assembleia){
        Assembleia assembleia1 = consAssembleiaCod(assembleia);

        if(assembleia1 != null){
            bdAssembleia.remove(assembleia1);
            return null;
        } else {
            return assembleia;
        }
    }

    public Assembleia atualizaAssembleiaCod(Assembleia assembleia){
        for(int i = 0; i < bdAssembleia.size(); i++){
            if (assembleia.getId() == bdAssembleia.get(i).getId()){
                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o NOVO nome",
                    "Atualização",
                    JOptionPane.QUESTION_MESSAGE
                );

                assembleia.setNomeDaEmpresa(nome);
                bdAssembleia.set(i, assembleia);  
                return bdAssembleia.get(i);
            }
        }
        return null;
    }
}
