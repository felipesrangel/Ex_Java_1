package numero2;

import java.util.Scanner;

public class Numero2 {

    public static void main(String[] args) {
        int mesAtraso;
        String nomeDono;
        int matricula;
        double imposto;
        int num;

        Scanner scanner = new Scanner(System.in);
        Municipio municipio = new Municipio();

        do {
            System.out.println("0 - Sair do programa.\n"
                             + "1 - Cadastra uma nova casa.\n"
                             + "2 - Procura casa pela matricula.\n"
                             + "3 - Exibe todas casas cadastradas.\n"
                             + "4 - Exibe o imposto do imovel desejado.");
                             
            num = scanner.nextInt();
            switch (num) {
                case 0:
                    System.out.println("Volte sempre.");
                    break;
                case 1:
                    System.out.println("Insira o nome do(a) dono(a) da casa: ");
                    nomeDono = scanner.next();

                    System.out.println("Insira a matricula da casa: ");
                    matricula = scanner.nextInt();

                    System.out.println("Insira o imposto inicial a ser pago: ");
                    imposto = scanner.nextLong();

                    System.out.println("Insira os meses de atraso: ");
                    mesAtraso = scanner.nextInt();
                    
                    Imovel imovel = new Imovel(matricula, nomeDono, mesAtraso, imposto);
                    municipio.addImovel(imovel);
                    break;                    
                case 2:
                    System.out.println("Digite a matrícula da casa a ser procurada.");
                    matricula = scanner.nextInt();
                    municipio.buscarImovel(matricula);
                    break;
                case 3:
                    municipio.exibirImovel();
                    break;               
                case 4:
                    System.out.println("Informe a matricula do imovel: ");
                    matricula = scanner.nextInt();
                    municipio.valorImposto(matricula);
                    break;
                default:
                    System.out.println("VALOR INVALIDO.");
                    break;
            }
        } while (num != 0);
    }

}
