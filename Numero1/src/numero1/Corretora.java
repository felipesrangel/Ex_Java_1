package numero1;

import java.util.*;

public class Corretora {

    private String nome;
    private String CNPJ;
    private Endereco endereco;
    private double totalEmpresa;
    private Corretor corretor;
    private Corretor corretor1;
    private Corretor corretor2;

    public Corretora(String nome, Endereco endenreco) {
        this.nome = nome;
        this.endereco = endenreco;
    }

    public void quantVenda(int matricula, int quantVenda) {
        if (getCorretor().getMatricula() == matricula) {
            corretor.setQuantVenda(quantVenda);

        } else if (getCorretor1().getMatricula() == matricula) {
            corretor1.setQuantVenda(quantVenda);

        } else if (getCorretor2().getMatricula() == matricula) {
            corretor2.setQuantVenda(quantVenda);
        }
    }

    public void pesquisarCorretor(int matricula) {
        if (getCorretor().getMatricula() == matricula) {
            System.out.println("Matricula: " + this.corretor.getMatricula());
            System.out.println("Corretora: " + this.corretor.getNome());
            System.out.println("Meta mensal: " + this.corretor.getMetaMensal());
            System.out.println("Quantidade vendidos: " + this.corretor.getQuantVenda());

        } else if (getCorretor1().getMatricula() == matricula) {
            System.out.println("Matricula: " + this.corretor1.getMatricula());
            System.out.println("Corretora: " + this.corretor1.getNome());
            System.out.println("Meta mensal: " + this.corretor1.getMetaMensal());
            System.out.println("Quantidade vendidos: " + this.corretor1.getQuantVenda());

        } else if (getCorretor2().getMatricula() == matricula) {
            System.out.println("Matricula: " + this.corretor2.getMatricula());
            System.out.println("Corretora: " + this.corretor2.getNome());
            System.out.println("Meta mensal: " + this.corretor2.getMetaMensal());
            System.out.println("Quantidade vendidos: " + this.corretor2.getQuantVenda());
        }

    }

    public void exibeCorretor() {
        System.out.println("Matricula: " + this.corretor.getMatricula());
        System.out.println("Corretora: " + this.corretor.getNome());
        System.out.println("Meta mensal: " + this.corretor.getMetaMensal());
        System.out.println("Quantidade vendidos: " + this.corretor.getQuantVenda());
        System.out.println("");
        System.out.println("Matricula: " + this.corretor1.getMatricula());
        System.out.println("Corretora: " + this.corretor1.getNome());
        System.out.println("Meta mensal: " + this.corretor1.getMetaMensal());
        System.out.println("Quantidade vendidos: " + this.corretor1.getQuantVenda());
        System.out.println("");
        System.out.println("Matricula: " + this.corretor2.getMatricula());
        System.out.println("Corretora: " + this.corretor2.getNome());
        System.out.println("Meta mensal: " + this.corretor2.getMetaMensal());
        System.out.println("Quantidade vendidos: " + this.corretor2.getQuantVenda());
    }

    public boolean validarCnpj(String cnpj) {
        if (!cnpj.substring(0, 1).equals("")) {
            try {
                cnpj = cnpj.replace('.', ' ');//onde há ponto coloca espaço
                cnpj = cnpj.replace('/', ' ');//onde há barra coloca espaço
                cnpj = cnpj.replace('-', ' ');//onde há traço coloca espaço
                cnpj = cnpj.replaceAll(" ", "");//retira espaço
                int soma = 0, dig;
                String cnpj_calc = cnpj.substring(0, 12);

                if (cnpj.length() != 14) {
                    return false;
                }
                char[] chr_cnpj = cnpj.toCharArray();
                /* Primeira parte */
                for (int i = 0; i < 4; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
                        soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);
                cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
                /* Segunda parte */
                soma = 0;
                for (int i = 0; i < 5; i++) {
                    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
                        soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
                        soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
                    }
                }
                dig = 11 - (soma % 11);
                cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
                return cnpj.equals(cnpj_calc);
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public void totalEmpresa() {
        System.out.println(totalEmpresa = corretor.getQuantVenda() + corretor1.getQuantVenda()
                + corretor2.getQuantVenda());
    }

    public boolean setCNPJ(String CNPJ) {
        if (validarCnpj(CNPJ)) {
            this.CNPJ = CNPJ;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getTotalEmpresa() {
        return totalEmpresa;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public Corretor getCorretor1() {
        return corretor1;
    }

    public Corretor getCorretor2() {
        return corretor2;
    }

    public void getCorretor2(Corretor corretor2) {
        this.corretor2 = corretor2;
    }

    public void getCorretor1(Corretor corretor1) {
        this.corretor1 = corretor1;
    }

    public void getCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public void getTotalEmpresa(double totalEmpresa) {
        this.totalEmpresa = totalEmpresa;
    }

    public void getNome(String nome) {
        this.nome = nome;
    }

    public void getEndereco(Endereco endenreco) {
        this.endereco = endenreco;
    }

}
