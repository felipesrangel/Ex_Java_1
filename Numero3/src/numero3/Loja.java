package numero3;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public class Loja {

    private String nome;
    private Funcionario funcionario;
    Map<Integer, Pedido> pedidos = new HashMap<>();

    public Loja(String nome, Funcionario funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public void exibirPedidos() {
        if (pedidos.size() == 0) {
            System.out.println("NENHUM PEDIDO FOI CADASTRADO.");
        } else {
            SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            for (Entry<Integer, Pedido> each : pedidos.entrySet()) {
                System.out.println("ID: " + each.getKey());
                Pedido pedido = each.getValue();
                System.out.println("Loja: " + pedido.getLoja().getNome());
                System.out.println("Data: " + data.format(pedido.getDataEmissao()));
                System.out.println("Valor total: " + pedido.getValorTotalCalculado());
                System.out.println("");
            }
       }
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.put(pedido.getPedidoId(), pedido);
    }

    public void removePedido(int id) {
        this.pedidos.remove(id);
    }

    public void clearPedido() {
        System.out.println("TODOS OS PEDIDOS FORAM REMOVIDOS.");
        pedidos.clear();
    }

    public void buscarPedido(int id) {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        if (this.pedidos.containsKey(id)) {
            System.out.println("ID: " + this.pedidos.get(id).getPedidoId());
            System.out.println("Loja: " + this.pedidos.get(id).getLoja().getNome());
            System.out.println("Data: " + data.format(this.pedidos.get(id).getDataEmissao()));
            System.out.println("Valor total: " + this.pedidos.get(id).getValorTotalCalculado());
        }
    }

    public String getNome() {
        return nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
