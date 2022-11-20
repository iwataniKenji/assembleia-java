// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerAssembleiaPresencial {

    private List<Presencial> bdAssembleiaPresencial = new ArrayList<Presencial>();

    // singleton
    private static GerAssembleiaPresencial gerAssembleiaUnico;

    GerAssembleiaPresencial(){

    }

    public static GerAssembleiaPresencial getGerAssembleia(){
        if(gerAssembleiaUnico == null){
            gerAssembleiaUnico = new GerAssembleiaPresencial();
        }    

        return gerAssembleiaUnico;
    }

    public List<Presencial> getBdAssembleia(){
        return bdAssembleiaPresencial;
    }

    // create
    public Presencial cadAssembleia(Presencial presencial){
        if (consAssembleiaById(presencial)== null) {
            bdAssembleiaPresencial.add(presencial);
            return presencial;
        } else {
            return null;
        }
    }

    // read
    public Presencial consAssembleiaById(Presencial presencial){
        for(int i = 0; i < bdAssembleiaPresencial.size(); i++){
            if(presencial.getId() == bdAssembleiaPresencial.get(i).getId()){
                return bdAssembleiaPresencial.get(i);
            }
        }
        return null;
    }

    // delete
    public Presencial removeAssembleiaById(Presencial presencial){
        Presencial assembleiaAux = consAssembleiaById(presencial);

        if(assembleiaAux != null){
            bdAssembleiaPresencial.remove(assembleiaAux);
            return null;
        } else {
            return presencial;
        }
    }

    // update
    public Presencial atualizaAssembleiaById(Presencial presencial){
        for(int i = 0; i < bdAssembleiaPresencial.size(); i++){
            if (presencial.getId() == bdAssembleiaPresencial.get(i).getId()){
                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo nome da empresa",
                    "Atualização",
                    JOptionPane.QUESTION_MESSAGE
                );

                presencial.setNomeDaEmpresa(nome);
                bdAssembleiaPresencial.set(i, presencial);  
                return bdAssembleiaPresencial.get(i);
            }
        }
        return null;
    }
}
