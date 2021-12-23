package numero1;

import java.util.Scanner;

public class Numero1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num, numero;
        String nomeLoja, nomeFuncionario, cnpj, cep, rua;
        int matricula, meta, quantVenda;

        // corretora
        System.out.println("Cadastrar a corretora. ");
        System.out.println("Informe o nome da Corretora: ");
        nomeLoja = scanner.nextLine();
        System.out.println("Informe a rua: ");
        rua = scanner.nextLine();
        System.out.println("Informe o numero do endereço: ");
        numero = scanner.nextInt();
        System.out.println("Informe o CEP: ");
        cep = scanner.nextLine();
        cep = scanner.nextLine();
        
        Endereco enderecoCorretora = new Endereco(rua, cep, numero);
        Corretora constroiSuperRapido = new Corretora(nomeLoja, enderecoCorretora);
        System.out.println("Informe o CNPJ da Corretora: ");
        cnpj = scanner.next();

        //valida cnpj
        while (!constroiSuperRapido.setCNPJ(cnpj)) {
            System.out.println("Coloque um CNPJ valido: ");
            cnpj = scanner.next();
            constroiSuperRapido.setCNPJ(cnpj);
        }
        System.out.println("");
        //corretor 1
        System.out.println("Cadastrar o primeiro corretor. ");
        System.out.println("Informe o nome: ");
        nomeFuncionario = scanner.nextLine();
        nomeFuncionario = scanner.nextLine();
        System.out.println("Matricula: ");
        matricula = scanner.nextInt();
        System.out.println("Meta de vendas: ");
        meta = scanner.nextInt();
        System.out.println("Quantidade de vendas: ");
        quantVenda = scanner.nextInt();
        System.out.println("Informe a rua: ");
        rua = scanner.nextLine();
        rua = scanner.nextLine();
        System.out.println("Informe o numero da residência: ");
        numero = scanner.nextInt();
        System.out.println("Informe o CEP: ");
        cep = scanner.nextLine();
        cep = scanner.nextLine();
        

        Endereco enderecoCorretor = new Endereco(rua, cep, numero);
        Corretor corretor = new Corretor(nomeFuncionario, meta, quantVenda, 
                enderecoCorretor, matricula);
        System.out.println("");
        //corretor 2
        System.out.println("Cadastrar o segundo corretor. ");
        System.out.println("Informe o nome: ");
        nomeFuncionario = scanner.nextLine();
        System.out.println("Matricula: ");
        matricula = scanner.nextInt();
        System.out.println("Meta de vendas: ");
        meta = scanner.nextInt();
        System.out.println("Quantidade de vendas: ");
        quantVenda = scanner.nextInt();
        System.out.println("Informe a rua: ");
        rua = scanner.nextLine();
        rua = scanner.nextLine();
        System.out.println("Informe o numero da residência: ");
        numero = scanner.nextInt();
        System.out.println("Informe o CEP: ");
        cep = scanner.nextLine();
        cep = scanner.nextLine();
        

        Endereco enderecoCorretor1 = new Endereco(rua, cep, numero);
        Corretor corretor1 = new Corretor(nomeFuncionario, meta, quantVenda, 
                enderecoCorretor, matricula);
        System.out.println("");
        //corretor 3
        System.out.println("Cadastrar o terceiro corretor. ");
        System.out.println("Informe o nome: ");
        nomeFuncionario = scanner.nextLine();
        System.out.println("Matricula: ");
        matricula = scanner.nextInt();
        System.out.println("Meta de vendas: ");
        meta = scanner.nextInt();
        System.out.println("Quantidade de vendas: ");
        quantVenda = scanner.nextInt();
        System.out.println("Informe a rua: ");
        rua = scanner.nextLine();
        rua = scanner.nextLine();
        System.out.println("Informe o numero da residência: ");
        numero = scanner.nextInt();
        System.out.println("Informe o CEP: ");
        cep = scanner.nextLine();
        cep = scanner.nextLine();
        

        Endereco enderecoCorretor2 = new Endereco(rua, cep, numero);
        Corretor corretor2 = new Corretor(nomeFuncionario, meta, quantVenda, 
                enderecoCorretor, matricula);

        //atribui os corretores na corretora
        constroiSuperRapido.getCorretor(corretor);
        constroiSuperRapido.getCorretor1(corretor1);
        constroiSuperRapido.getCorretor2(corretor2);

        do {
            System.out.println("1- Alterar quantidade de vendas de cada corretor.\n"
                             + "2- Exibe total de venda da loja.\n"
                             + "3- Exibe todos os corretorretores.\n"
                             + "4- Pesquisa corretor pela matricula.\n"
                             + "0- Parar o programa.");

            num = scanner.nextInt();

            switch (num) {
                case 0:
                    System.out.println("Volte sempre.");
                    break;
                case 1:
                    System.out.println("Matricula do corretor desejado.");
                    matricula = scanner.nextInt();
                    System.out.println("Quantidade de venda..");
                    quantVenda = scanner.nextInt();
                    constroiSuperRapido.quantVenda(matricula, quantVenda);
                    break;
                case 2:
                    constroiSuperRapido.totalEmpresa();
                    break;
                case 3:
                    constroiSuperRapido.exibeCorretor();
                    break;
                case 4: 
                    System.out.println("Matricula do corretor desejado.");
                    matricula = scanner.nextInt();
                    constroiSuperRapido.pesquisarCorretor(matricula);
                    break;
                default:
                    System.out.println("VALOR INVALIDO.");
                    break;
            }
        } while (num != 0);
    }
}
