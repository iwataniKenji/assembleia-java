// NOME: KLEVERSON KENJI IWATANI
// CURSO: Análise e Desenvolvimento de Sistemas
// RA: 2465205

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerAssembleiaOnline {

    private List<Online> bdAssembleiaOnline = new ArrayList<Online>();

    // singleton
    private static GerAssembleiaOnline gerAssembleiaUnico;

    GerAssembleiaOnline(){

    }

    public static GerAssembleiaOnline getGerAssembleia(){
        if(gerAssembleiaUnico == null){
            gerAssembleiaUnico = new GerAssembleiaOnline();
        }    

        return gerAssembleiaUnico;
    }

    public List<Online> getBdAssembleia(){
        return bdAssembleiaOnline;
    }

    // create
    public Online cadAssembleia(Online online){
        if (consAssembleiaById(online)== null) {
            bdAssembleiaOnline.add(online);
            return online;
        } else {
            return null;
        }
    }

    // read
    public Online consAssembleiaById(Online online){
        for(int i = 0; i < bdAssembleiaOnline.size(); i++){
            if(online.getId() == bdAssembleiaOnline.get(i).getId()){
                return bdAssembleiaOnline.get(i);
            }
        }
        return null;
    }

    // delete
    public Online removeAssembleiaById(Online online){
        Online assembleiaAux = consAssembleiaById(online);

        if(assembleiaAux != null){
            bdAssembleiaOnline.remove(assembleiaAux);
            return null;
        } else {
            return online;
        }
    }

    // update
    public Online atualizaAssembleiaById(Online online){
        for(int i = 0; i < bdAssembleiaOnline.size(); i++){
            if (online.getId() == bdAssembleiaOnline.get(i).getId()){
                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo nome da empresa",
                    "Atualização",
                    JOptionPane.QUESTION_MESSAGE
                );

                online.setNomeDaEmpresa(nome);
                bdAssembleiaOnline.set(i, online);  
                return bdAssembleiaOnline.get(i);
            }
        }
        return null;
    }
}
