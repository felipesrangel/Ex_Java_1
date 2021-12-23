package numero2;

import java.util.HashMap;
import java.util.Map;

public class Municipio {

    Map<Integer, Imovel> imoveis = new HashMap<>();

    public void exibirImovel() {
        for (Map.Entry<Integer, Imovel> each : imoveis.entrySet()) {
            
            // No caso, a 'key' é a Integer com o Matricula do imóvel.
            System.out.println("Matricula do imóvel: " + each.getKey());

            // E o 'value' é o nosso objeto 'Element'.
            Imovel imovel = each.getValue();
            System.out.println("Nome do proprietário: " + imovel.getNomeProprietario());
            System.out.println("Imposto inicial: " + imovel.getPorcentagemImposto());
            System.out.println("Meses de atraso: " + imovel.getMesesAtraso());
            System.out.println("Valor com juros: " + imovel.getImposto());
            System.out.println("");
        }
    }

    public void addImovel(Imovel imovel) {
        this.imoveis.put(imovel.getMatricula(), imovel);
    }

    public void buscarImovel(int matricula) {
        if (imoveis.containsKey(matricula)) {
            System.out.println("Matricula do imóvel: " + imoveis.get(matricula).getMatricula());
            System.out.println("Nome do proprietário: " + imoveis.get(matricula).getNomeProprietario());
            System.out.println("Imposto inicial: " + imoveis.get(matricula).getPorcentagemImposto());
            System.out.println("Meses de atraso: " + imoveis.get(matricula).getMesesAtraso());
            System.out.println("Valor com juros: " + imoveis.get(matricula).getImposto());
        }
    }
    
    public void valorImposto(int matricula){
        System.out.println(imoveis.get(matricula).getImposto());             
    }
    
}
