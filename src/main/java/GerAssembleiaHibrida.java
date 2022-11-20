// NOME: KLEVERSON KENJI IWATANI
// CURSO: Análise e Desenvolvimento de Sistemas
// RA: 2465205

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerAssembleiaHibrida {

    private List<Hibrida> bdAssembleiaHibrida = new ArrayList<Hibrida>();

    // singleton
    private static GerAssembleiaHibrida gerAssembleiaUnico;

    GerAssembleiaHibrida(){

    }

    public static GerAssembleiaHibrida getGerAssembleia(){
        if(gerAssembleiaUnico == null){
            gerAssembleiaUnico = new GerAssembleiaHibrida();
        }    

        return gerAssembleiaUnico;
    }

    public List<Hibrida> getBdAssembleia(){
        return bdAssembleiaHibrida;
    }

    // create
    public Hibrida cadAssembleia(Hibrida hibrida){
        if (consAssembleiaById(hibrida)== null) {
            bdAssembleiaHibrida.add(hibrida);
            return hibrida;
        } else {
            return null;
        }
    }

    // read
    public Hibrida consAssembleiaById(Hibrida hibrida){
        for(int i = 0; i < bdAssembleiaHibrida.size(); i++){
            if(hibrida.getId() == bdAssembleiaHibrida.get(i).getId()){
                return bdAssembleiaHibrida.get(i);
            }
        }
        return null;
    }

    // delete
    public Hibrida removeAssembleiaById(Hibrida hibrida){
        Hibrida assembleiaAux = consAssembleiaById(hibrida);

        if(assembleiaAux != null){
            bdAssembleiaHibrida.remove(assembleiaAux);
            return null;
        } else {
            return hibrida;
        }
    }

    // update
    public Hibrida atualizaAssembleiaById(Hibrida hibrida){
        for(int i = 0; i < bdAssembleiaHibrida.size(); i++){
            if (hibrida.getId() == bdAssembleiaHibrida.get(i).getId()){
                String nome = JOptionPane.showInputDialog(
                    null,
                    "Informe o novo nome da empresa",
                    "Atualização",
                    JOptionPane.QUESTION_MESSAGE
                );

                hibrida.setNomeDaEmpresa(nome);
                bdAssembleiaHibrida.set(i, hibrida);  
                return bdAssembleiaHibrida.get(i);
            }
        }
        return null;
    }
}
