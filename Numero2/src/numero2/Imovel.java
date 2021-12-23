package numero2;

public class Imovel {

    private String nomeProprietario;
    private int matricula;
    private double imposto;
    private int mesesAtraso;
    private double porcentagemImposto;

    public Imovel(int matricula, String nome, int atraso, double valor) {
        this.matricula = matricula;
        this.nomeProprietario = nome;
        this.mesesAtraso = atraso;
        this.porcentagemImposto = setImposto(valor);

    }
    
    public double calcularImposto(){
        double imposto = porcentagemImposto * 100 / 100;

        if (getMesesAtraso() > 0 && getMesesAtraso() <= 5) {
            imposto  = this.porcentagemImposto * 1.01;
        } else if (getMesesAtraso() > 5 && getMesesAtraso() <= 8) {
            return this.imposto  = this.porcentagemImposto * 1.023;
        } else if (getMesesAtraso() > 8 && getMesesAtraso() <= 10) {
            return this.imposto = this.porcentagemImposto * 1.03;
        } else if (getMesesAtraso() > 10 && getMesesAtraso() <= 12) {
            return this.imposto = this.porcentagemImposto * 1.054;
        } else if (getMesesAtraso() > 12) {
            return this.imposto = this.porcentagemImposto * 1.1;
        }
        return this.imposto = imposto;
    }
    
    public double setImposto(double imposto) {
       return this.imposto = imposto;
    }

    public void status() {
        System.out.println(getImposto());
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public int setMatricula(int matricula) {
        return this.matricula = matricula;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }

    public void setMesesAtraso(int mesesAtraso) {
        this.mesesAtraso = mesesAtraso;
    }

    public double getPorcentagemImposto() {
        return this.porcentagemImposto;
    }

    public double setPorcentagemImposto(double porcentagemImposto) {
        return this.porcentagemImposto = porcentagemImposto;
    }

    public double getImposto() {
        return this.calcularImposto();
    }

    
}
