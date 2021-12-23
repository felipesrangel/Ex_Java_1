package numero3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Numero3 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        
        int num;
        String nomeLoja, nomeFuncionario;
        int matricula;
        System.out.println("Informe o nome da loja: ");
        nomeLoja = scanner.next();
        System.out.println("Informe o nome do funcionario: ");
        nomeFuncionario = scanner.next();
        System.out.println("Informe o Matricula do funcionario: ");
        matricula = scanner.nextInt();
        Funcionario funcionario = new Funcionario(nomeFuncionario, matricula);
        Loja loja = new Loja(nomeLoja, funcionario);
        funcionario.setLoja(loja);

        do {
            System.out.println("0- Parar o programa.\n"
                             + "1- Adiociona pedido.\n"
                             + "2- Exibe todos os pedidos cadastrados.\n"
                             + "3- Remove o pedido pelo ID.\n"
                             + "4- Busca pedido pelo ID.\n"
                             + "5- Apaga todos os pedido da loja.");
            num = scanner.nextInt();

            switch (num) {
                case 0:
                    System.out.println("Volte sempre.");
                    break;
                case 1:
                    int pedidoId;
                    String dataEmissao;
                    float valorTotalCalculado;
                   
                    System.out.println("Insira o ID do produto: ");
                    pedidoId = scanner.nextInt();
                    System.out.println("Insira a Data de Emissão do produto (dd/MM/yyyy): ");
                    dataEmissao = scanner.next();
                    Date data1 = data.parse(dataEmissao);
                    System.out.println("Insira o Valor total do produto: ");
                    valorTotalCalculado = scanner.nextFloat();
                    
                    Pedido pedido = new Pedido(loja, pedidoId, data1, valorTotalCalculado);
                    
                    loja.addPedido(pedido);
                    break;
                case 2:
                    loja.exibirPedidos();
                    break;
                case 3:
                    int id;
                    System.out.println("Digite o ID do produto que vc deseja: ");
                    id = scanner.nextInt();
                    loja.removePedido(id);
                    break;
                case 4:
                    System.out.println("Digite o ID do produto que vc deseja: ");
                    id = scanner.nextInt();
                    loja.buscarPedido(id);
                    break;
                case 5:
                    loja.clearPedido();
                    break;
                default:
                    System.out.println("VALOR INVALIDO.");
                    break;
            }
        } while (num != 0);
    }
}
