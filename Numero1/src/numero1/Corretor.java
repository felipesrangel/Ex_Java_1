package numero1;

public class Corretor {

    private Corretora corretora;
    private String nome;
    private int matricula;
    private double metaMensal;
    private int quantVenda;
    private Endereco endereco;
    
    public Corretor(String nome, double metaMensal, int quantVenda, Endereco endereco, int matricula) {
        this.nome = nome;
        this.metaMensal = metaMensal;
        this.quantVenda = quantVenda;
        this.endereco = endereco;
        this.matricula = matricula;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setMetaMensal(double metaMensal) {
        this.metaMensal = metaMensal;
    }

    public void setQuantVenda(int quantVenda) {
        this.quantVenda = quantVenda;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getMetaMensal() {
        return metaMensal;
    }

    public double getQuantVenda() {
        return quantVenda;
    }

    public void setCorretora(Corretora corretora) {
        this.corretora = corretora;
    }

    public Corretora getCorretora() {
        return corretora;
    }

}
